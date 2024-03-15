package ParcialesFinales.finalCartas;

import Tp7.ejercicio4.CriterioOr;

import java.util.ArrayList;

public class Combo extends ElementoEnvio{

    ArrayList<ElementoEnvio> envios;

    Criterio criterio;

    public Combo(int nroTracking, Criterio criterio) {
        super(nroTracking);
        envios = new ArrayList<>();
        this.criterio = criterio;
    }

    public ArrayList<ElementoEnvio> getEnvios() {
        return new ArrayList<>(envios);
    }

    public void addElemento(ElementoEnvio e){
        if (criterio.cumple(e)){
            envios.add(e);
            e.setNroTracking(this.nroTracking);
        }
    }


    @Override
    public void setNroTracking(int nroTracking) {
        super.setNroTracking(nroTracking);
        for (ElementoEnvio e :envios){
            e.setNroTracking(nroTracking);
        }
    }

    @Override
    public Direccion getDireccionDestinatario() {
        return envios.getFirst().getDireccionDestinatario();
    }

    @Override
    public Direccion getDireccionRemitente() {
        return envios.getFirst().getDireccionRemitente();
    }

    @Override
    public Persona getRemitente() {
      return envios.getFirst().getRemitente();
    }

    @Override
    public Persona getDestinatario() {
        return envios.getFirst().getDestinatario();
    }

    @Override
    public double getPeso() {
        double suma=0;
        for(ElementoEnvio e : envios){
            suma+=e.getPeso();
        }
        return suma;
    }

    public ArrayList<ElementoEnvio> buscar(Criterio c){
        ArrayList<ElementoEnvio> cumplidores = new ArrayList<>();
        for (ElementoEnvio e : envios){
            cumplidores.addAll(e.buscar(c));
        }
        return cumplidores;
    }

    @Override
    public ElementoEnvio copia(Criterio c) {
        Combo comboCopia = new Combo(this.getNroTracking(),this.criterio);
        for (ElementoEnvio e : envios){
           ElementoEnvio copiaHijo= e.copia(c);
            if (copiaHijo!= null){
                comboCopia.addElemento(copiaHijo);
            }
        }
        if (comboCopia.envios.isEmpty()){
            return null;
        }
        return comboCopia;
    }
}
