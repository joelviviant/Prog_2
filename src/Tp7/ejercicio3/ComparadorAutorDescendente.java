package Tp7.ejercicio3;

public class ComparadorAutorDescendente extends ComparadorAutor{

    @Override
    public int compare(Libro o1, Libro o2) {
        return super.compare(o1, o2)*-1;
    }
}
