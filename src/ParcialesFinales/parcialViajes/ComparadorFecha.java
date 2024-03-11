package ParcialesFinales.parcialViajes;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorFecha implements Comparator<PaqueteGeneral> {

    @Override
    public int compare(PaqueteGeneral c1, PaqueteGeneral c2) {
        LocalDate f1 = c1.getFechaDePago();
        LocalDate f2 = c2.getFechaDePago();
        if (f1 != null) {
            return f1.compareTo(f2);
        }
        if (f2 != null) {
            return -1;
        }
        return 0;
    }
}


