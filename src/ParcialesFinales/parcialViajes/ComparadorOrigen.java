package ParcialesFinales.parcialViajes;

import java.util.Comparator;

public class ComparadorOrigen implements Comparator<PaqueteGeneral> {

    @Override
    public int compare(PaqueteGeneral o1, PaqueteGeneral o2) {
         return o1.getOrigen().compareTo(o2.getOrigen());

    }
}
