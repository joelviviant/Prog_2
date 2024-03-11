package ParcialesFinales.parcialViajes;

import java.util.Comparator;

public class ComparadorOrigen implements Comparator<PaqueteGeneral> {

    @Override
    public int compare(PaqueteGeneral o1, PaqueteGeneral o2) {
         int result = o1.getOrigen().compareTo(o2.getOrigen());
         if (result>0){
             return 1;
         } else if (result<0) {
             return -1;
         }else {
             return 0;
         }
    }
}
