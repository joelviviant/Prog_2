package ParcialesFinales.finalBanavest;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<InversionGeneral> {
    Comparator<InversionGeneral> c1;
    Comparator<InversionGeneral> c2;


    @Override
    public int compare(InversionGeneral o1, InversionGeneral o2) {
        int res= c1.compare(o1, o2);
        if (res == 0){
            return  c2.compare(o1, o2);
        }return res;
    }

    //public abstract class ComparadorCandidato implements Comparator<Candidato> {
    //
    //    ComparadorCandidato sig;
    //
    //    public ComparadorCandidato(ComparadorCandidato sig) {
    //        this.sig = sig;
    //    }
    //
    //    public abstract int comparar(Candidato c1, Candidato c2);
    //
    //    @Override
    //    public int compare(Candidato c1, Candidato c2) {
    //        int res = comparar(c1, c2);
    //        if (res==0){
    //            if (sig!=null)
    //                return sig.compare(c1, c2);
    //            else
    //                return 0;
    //        }
    //        return res;
    //    }
    //
    //
    //}
}
