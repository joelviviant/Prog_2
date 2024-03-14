package ParcialesFinales.finalBetular;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class ElementoComida {

    String nombre;

    public ElementoComida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public abstract double getCalorias();

    public abstract double getPrecio();

    public abstract int getTiempoDeCoccion();
    public abstract ArrayList<String> getModoDePreparacion();
    public abstract ArrayList<String> getTipoDeComida();
}
