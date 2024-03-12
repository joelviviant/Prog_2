package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroNot extends Filtro {

    Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(InversionGeneral i) {
        return !f1.cumple(i);
    }
}
