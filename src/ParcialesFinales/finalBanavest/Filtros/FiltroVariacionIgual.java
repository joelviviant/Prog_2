package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroVariacionIgual extends Filtro {

    @Override
    public boolean cumple(InversionGeneral i) {
        return  i.getVariacion()==0;
    }

}
