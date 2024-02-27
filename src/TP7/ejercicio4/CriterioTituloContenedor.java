package TP7.ejercicio4;

public class CriterioTituloContenedor extends Criterio{
    String palabra;

    public CriterioTituloContenedor(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().contains(palabra);
    }
}
