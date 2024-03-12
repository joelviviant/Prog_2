package ParcialesFinales.finalBanavest.Estrategias;

import ParcialesFinales.finalBanavest.InversionGeneral;

public class CriterioVariacionCierre extends Criterio{

    double porcentaje;
    int pos1;
    int pos2;

    public CriterioVariacionCierre(double porcentaje,int pos1, int pos2){
        this.porcentaje=porcentaje;
        this.pos1=pos1;
        this.pos2=pos2;
    }
    @Override
    public boolean esRentable(InversionGeneral i) {
        int size= i.getValoresDeCierre().size();
        if (pos1 <size && pos2<size ){
            return getVariacion(i)>porcentaje;
        }
        return false;
    }

    public double getVariacion(InversionGeneral i){
        double a = i.getValoresDeCierre().get(pos1);
        double b = i.getValoresDeCierre().get(pos2);
        return (a-b)/b;
    }
}

