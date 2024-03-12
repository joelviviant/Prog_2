package ParcialesFinales.finalBanavest.Comparadores;

import ParcialesFinales.finalBanavest.InversionGeneral;

import java.util.Comparator;

public class ComparadorValorDeCierre implements Comparator<InversionGeneral>{

    @Override
    public int compare(InversionGeneral o1, InversionGeneral o2) {
        if (o1.getValoresDeCierre().getLast() > o2.getValoresDeCierre().getLast()){
            return 1;
        } else if (o2.getValoresDeCierre().getLast() > o1.getValoresDeCierre().getLast()) {
            return -1;
        }else {
            return 0;
        }
    }
}
