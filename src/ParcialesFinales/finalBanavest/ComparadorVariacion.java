package ParcialesFinales.finalBanavest;

import java.util.Comparator;

public class ComparadorVariacion implements Comparator<InversionGeneral> {
    @Override
    public int compare(InversionGeneral o1, InversionGeneral o2) {
        if (o1.getVariacion() > o2.getVariacion()){
            return 1;
        } else if (o2.getVariacion() > o1.getVariacion()) {
            return -1;
        }else {
            return 0;
        }
    }
}
