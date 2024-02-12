package TP5.ejercicio2;

import java.util.Objects;

public class Habilidad {
    private String nombre;

    public Habilidad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return Objects.equals(nombre, habilidad.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
