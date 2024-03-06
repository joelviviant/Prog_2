package Tp8.ejercicio7;

public class ComparadorAgrupacion extends ComparadorCandidato{
    public ComparadorAgrupacion(ComparadorCandidato sig) {
        super(sig);
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return c1.getAgrupacion().compareTo(c2.getAgrupacion());
    }
}
