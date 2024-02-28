package TP7.ejercicio4;

public class CriterioTituloContenedor implements Criterio{
    String palabra;

    public CriterioTituloContenedor(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().contains(palabra);
    }
}
