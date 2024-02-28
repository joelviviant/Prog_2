package TP7.ejercicio4;

public class CriterioAutor implements Criterio{

    String autor;

    public CriterioAutor(String autor){
        this.autor=autor;
    }
    @Override
    public boolean cumple(Documento d) {
        return d.getAutores().contains(autor);
    }
}
