package com.exam1.factura.numero;

public class NumeroFactura {
    private String numero;

    public NumeroFactura() {}

    public NumeroFactura(String numero) {
        this.numero = numero;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
}