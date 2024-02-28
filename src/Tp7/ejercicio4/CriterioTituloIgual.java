package Tp7.ejercicio4;

public class CriterioTituloIgual implements Criterio{
    String titulo;

    public CriterioTituloIgual(String titulo){
        this.titulo = titulo;
    }


    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulo);
    }
}
