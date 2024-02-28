package TP7.ejercicio4;

public class CriterioContenido implements Criterio{

    String palabra;

    public CriterioContenido(String palabra){
        this.palabra=palabra;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getContenidoTextual().equals(palabra);
    }
}
