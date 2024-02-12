package Adicionales.Adicional1;

import java.util.Objects;

public class Elemento {
    private String nombre;
    private String autor;
    private double precio;

    public Elemento(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio(Cliente cliente) {
        return precio*(1-cliente.getDescuento()/100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o;
        return Objects.equals(nombre, elemento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
