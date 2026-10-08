package com.exam1.factura.model;

import com.exam1.factura.fecha.FechaFactura;
import com.exam1.factura.numero.NumeroFactura;
import com.exam1.factura.proveedor.ProveedorFactura;
import com.exam1.factura.total.TotalFactura;
import jakarta.persistence.*;

@Entity
@Table(name = "factura_compra")
public class ModelFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProveedorFactura proveedor;

    @Embedded
    private NumeroFactura numero;

    @Embedded
    private TotalFactura total;

    @Embedded
    private FechaFactura fecha;

    public ModelFactura() {}

    public ModelFactura(ProveedorFactura proveedor, NumeroFactura numero,
                        TotalFactura total, FechaFactura fecha) {
        this.proveedor = proveedor;
        this.numero = numero;
        this.total = total;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public ProveedorFactura getProveedor() { return proveedor; }
    public void setProveedor(ProveedorFactura proveedor) { this.proveedor = proveedor; }

    public NumeroFactura getNumero() { return numero; }
    public void setNumero(NumeroFactura numero) { this.numero = numero; }

    public TotalFactura getTotal() { return total; }
    public void setTotal(TotalFactura total) { this.total = total; }

    public FechaFactura getFecha() { return fecha; }
    public void setFecha(FechaFactura fecha) { this.fecha = fecha; }
}