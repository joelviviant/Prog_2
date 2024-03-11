package ParcialesFinales.parcialViajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

    public abstract ArrayList<PaqueteGeneral> buscar(Filtro f1);

    public ArrayList<PaqueteGeneral> buscar(Filtro f1, Comparator<PaqueteGeneral> c1){
         ArrayList<PaqueteGeneral> result = this.buscar(f1);
        Collections.sort(result,c1);
        return result;
    }


}
