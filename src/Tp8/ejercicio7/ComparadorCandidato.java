package Tp8.ejercicio7;

import Tp7.ejercicio5.ComparadorFichas;

import java.util.Comparator;

public abstract class ComparadorCandidato implements Comparator<Candidato> {

    ComparadorCandidato sig;

    public ComparadorCandidato(ComparadorCandidato sig) {
        this.sig = sig;
    }

    public abstract int comparar(Candidato c1, Candidato c2);

    @Override
    public int compare(Candidato c1, Candidato c2) {
        int res = comparar(c1, c2);
        if (res==0){
            if (sig!=null)
                return sig.compare(c1, c2);
            else
                return 0;
        }
        return res;
    }


}
