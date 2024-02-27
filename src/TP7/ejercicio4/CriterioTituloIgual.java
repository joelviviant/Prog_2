package TP7.ejercicio4;

public class CriterioTituloIgual extends Criterio{
    String titulo;

    public CriterioTituloIgual(String titulo){
        this.titulo = titulo;
    }


    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulo);
    }
}
