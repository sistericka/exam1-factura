package com.exam1.factura.proveedor;

public class ProveedorFactura {
    private String proveedor;

    public ProveedorFactura() {}

    public ProveedorFactura(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
}