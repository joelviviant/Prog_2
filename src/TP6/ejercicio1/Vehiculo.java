package TP6.ejercicio1;

import java.time.LocalDate;

public class Vehiculo extends Item{
    String marca;
    double km;
    String patente;
    String tipoDeAuto;
    boolean disponible;

    public Vehiculo(LocalDate fechaVencimiento) {
        super(fechaVencimiento);
    }

    @Override
    public boolean alquilarItem(Item e, Cliente c) {
        if (disponible) {
            c.itemsAlquilados.add(e);
            disponible=false;
            fechaVencimiento = e.getFechaVencimiento();
            return true;
        }else return false;
    }
}
