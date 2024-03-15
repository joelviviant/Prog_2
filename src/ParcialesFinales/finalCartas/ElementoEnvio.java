package ParcialesFinales.finalCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoEnvio {

    int nroTracking;


    public ElementoEnvio(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public int getNroTracking() {
        return nroTracking;
    }

    public abstract Direccion getDireccionDestinatario();
    public abstract Direccion getDireccionRemitente();

    public abstract Persona getRemitente();
    public abstract Persona getDestinatario();
    public abstract double getPeso();
    public abstract ArrayList<ElementoEnvio> buscar(Criterio c);
    public ArrayList<ElementoEnvio> buscar(Criterio c, Comparator<ElementoEnvio> c1){
        ArrayList<ElementoEnvio> cumplidores = new ArrayList<>();
        cumplidores.addAll(buscar(c));
        Collections.sort(cumplidores,c1);
        return cumplidores;
    }

    public abstract ElementoEnvio copia(Criterio c);

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }
}
