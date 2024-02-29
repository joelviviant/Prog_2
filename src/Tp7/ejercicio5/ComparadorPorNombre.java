package Tp7.ejercicio5;
public class ComparadorPorNombre extends ComparadorFichas {
    private final boolean ascendente;

    public ComparadorPorNombre(boolean ascendente) {
        this.ascendente = ascendente;
    }
    public ComparadorPorNombre(ComparadorFichas siguiente, boolean ascendente) {
        super(siguiente);
        this.ascendente = ascendente;
    }


    @Override
    public int comparar(FichaPlanta ficha1, FichaPlanta ficha2) {
        int comparacion = ficha1.getNombreCientifico().compareTo(ficha2.getNombreCientifico());
        return ascendente ? comparacion : -comparacion;
    }

}
