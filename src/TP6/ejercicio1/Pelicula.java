package TP6.ejercicio1;

import java.time.LocalDate;

public class Pelicula extends Item{
    String informacionFilmografica;
    int cantidadCopias;

    public Pelicula(LocalDate fechaVencimiento) {
        super(fechaVencimiento);
    }

    @Override
    public boolean alquilarItem(Item e, Cliente c) {
        if (cantidadCopias > 0) {
        c.itemsAlquilados.add(e);
        fechaVencimiento = e.getFechaVencimiento();
        cantidadCopias--;
        return true;
        }return false;
    }
}
