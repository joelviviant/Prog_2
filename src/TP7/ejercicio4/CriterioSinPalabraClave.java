package TP7.ejercicio4;

public class CriterioSinPalabraClave implements Criterio{

    String palabraClave;

    public CriterioSinPalabraClave(String palabraClave){
        this.palabraClave=palabraClave;
    }

    @Override
    public boolean cumple(Documento d) {
        return !d.getPalabrasClave().contains(palabraClave);
    }
}
