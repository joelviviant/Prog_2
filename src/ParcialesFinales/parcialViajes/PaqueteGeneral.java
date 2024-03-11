package ParcialesFinales.parcialViajes;

import java.time.LocalDate;

public abstract class PaqueteGeneral {

    int id;
    private int cantidadPersonas;

    public PaqueteGeneral(int id, int cantidadPersonas) {
        this.id = id;
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public abstract String getOrigen();
    public abstract String getDestino();
    public abstract double getCosto();
    public abstract LocalDate getFechaDePago();


}
