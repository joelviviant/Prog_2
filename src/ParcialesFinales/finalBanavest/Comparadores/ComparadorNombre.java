package ParcialesFinales.finalBanavest.Comparadores;

import ParcialesFinales.finalBanavest.InversionGeneral;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<InversionGeneral> {


    @Override
    public int compare(InversionGeneral o1, InversionGeneral o2) {
        return  o1.getNombre().compareTo(o2.getNombre());
    }
}
