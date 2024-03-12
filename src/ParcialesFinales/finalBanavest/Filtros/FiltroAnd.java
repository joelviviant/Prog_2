package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroAnd extends Filtro {

    Filtro f1;
    Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2){
        this.f1=f1;
        this.f2= f2;
    }

   public boolean cumple(InversionGeneral i){
        return f1.cumple(i) && f2.cumple(i);
   }
}
