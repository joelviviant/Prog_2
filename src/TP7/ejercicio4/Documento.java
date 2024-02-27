package TP7.ejercicio4;

import java.util.ArrayList;

public class Documento {

    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClave;


    public Documento(String titulo, String contenidoTextual) {
        this.titulo = titulo;
        this.contenidoTextual = contenidoTextual;
        autores = new ArrayList<>();
        palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }
}
