package Tp7.ejercicio5;

public class ComparadorPorRiego extends ComparadorFichas{

    private final boolean ascendente;

    public ComparadorPorRiego(boolean ascendente) {
        this.ascendente = ascendente;
    }
    public ComparadorPorRiego(ComparadorFichas siguiente, boolean ascendente) {
        super(siguiente);
        this.ascendente = ascendente;
    }

    @Override
    public int comparar(FichaPlanta ficha1, FichaPlanta ficha2) {
        int comparacion = ascendente ? ficha1.getRiego() - ficha2.getRiego() : ficha2.getRiego() - ficha1.getRiego();
        return comparacion;
    }
}
