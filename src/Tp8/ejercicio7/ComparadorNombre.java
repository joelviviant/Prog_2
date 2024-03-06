package Tp8.ejercicio7;

public class ComparadorNombre extends ComparadorCandidato{
    public ComparadorNombre(ComparadorCandidato sig) {
        super(sig);
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
        return c1.getNombre().compareTo(c2.getNombre());
    }
}
