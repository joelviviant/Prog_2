package Tp7.ejercicio3;

public class Libro  implements Comparable<Libro>{
    private int ISBN;
    private String  autor;
    private int anio;
    private   String genero;

    public Libro(int ISBN, String autor, int anio, String genero) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Libro otro) {
        return this.getISBN()-otro.getISBN();
    }
}
