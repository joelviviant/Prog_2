package ParcialesFinales.parcialViajes;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<PaqueteGeneral> {

    @Override
    public int compare(PaqueteGeneral o1, PaqueteGeneral o2) {
        double c1= o1.getCosto();
        double c2= o2.getCosto();

        if (c1>c2){
            return 1;
        } else if (c2>c1) {
            return -1;
        }else{
            return 0;
        }
    }
}
