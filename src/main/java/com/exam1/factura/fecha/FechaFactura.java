package com.exam1.factura.fecha;

import java.time.LocalDate;

public class FechaFactura {
    private LocalDate fecha;

    public FechaFactura() {}

    public FechaFactura(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}