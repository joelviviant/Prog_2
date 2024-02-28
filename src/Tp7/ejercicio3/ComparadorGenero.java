package Tp7.ejercicio3;

import java.util.Comparator;

public class ComparadorGenero implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getGenero().compareTo(o2.getGenero());
    }
}
