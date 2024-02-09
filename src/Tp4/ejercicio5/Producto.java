package Tp4.ejercicio5;

import java.time.LocalDate;

public class Producto {

    private String granjaOrigen;
    private LocalDate fechaVencimiento;
    private LocalDate fechaEnvasado;
    private int numeroLote;

    public Producto(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote) {
        this.granjaOrigen = granjaOrigen;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEnvasado = fechaEnvasado;
        this.numeroLote = numeroLote;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
}
