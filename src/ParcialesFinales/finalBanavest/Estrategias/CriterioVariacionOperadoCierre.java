package ParcialesFinales.finalBanavest.Estrategias;

import ParcialesFinales.finalBanavest.InversionGeneral;

public class CriterioVariacionOperadoCierre extends Criterio{

    double porcentaje;

    public CriterioVariacionOperadoCierre(double porcentaje){
        this.porcentaje=porcentaje;
    }
    @Override
    public boolean esRentable(InversionGeneral i) {
        return i.getVariacion()>porcentaje;
    }
}
