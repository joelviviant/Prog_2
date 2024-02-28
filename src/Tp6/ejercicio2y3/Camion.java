package Tp6.ejercicio2y3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Camion implements ElementoCola {
    private String nombre;
    private LocalDate fechaDeCarga;

    public Camion(String nombre, LocalDate fechaDeCarga) {
        this.nombre = nombre;
        this.fechaDeCarga = fechaDeCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeCarga() {
        return fechaDeCarga;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeCarga=" + fechaDeCarga +
                '}';
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        Period period=Period.between(this.getFechaDeCarga(),((Camion) otro).getFechaDeCarga());
       if (period.isNegative()){
           return false;
       }else return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camion camion = (Camion) o;
        return Objects.equals(fechaDeCarga, camion.fechaDeCarga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaDeCarga);
    }
}
