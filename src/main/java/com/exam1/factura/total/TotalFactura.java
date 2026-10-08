package com.exam1.factura.total;

public class TotalFactura {
    private Double total;

    public TotalFactura() {}

    public TotalFactura(Double total) {
        this.total = total;
    }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}