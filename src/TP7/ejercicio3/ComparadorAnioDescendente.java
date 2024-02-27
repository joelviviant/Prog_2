package TP7.ejercicio3;

public class ComparadorAnioDescendente extends ComparadorAnio{

    @Override
    public int compare(Libro o1, Libro o2) {
        return super.compare(o1, o2)*-1;
    }
}
