package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroVariacion extends Filtro {

    @Override
    public boolean cumple(InversionGeneral i) {
        return  i.getVariacion()>0;
    }
}
