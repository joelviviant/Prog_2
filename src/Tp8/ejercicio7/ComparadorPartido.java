package Tp8.ejercicio7;

public class ComparadorPartido extends ComparadorCandidato{
    public ComparadorPartido(ComparadorCandidato sig) {
        super(sig);
    }

    @Override
    public int comparar(Candidato c1, Candidato c2) {
       return c1.getPartidoPolitico().compareTo(c2.getPartidoPolitico());
    }
}
