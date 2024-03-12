package ParcialesFinales.finalBanavest.Estrategias;

import ParcialesFinales.finalBanavest.InversionGeneral;

public class CriterioCierreEnAumento extends Criterio{
    @Override
    public boolean esRentable(InversionGeneral i) {
        double actual = i.getValoresDeCierre().getFirst();
        if (i.getValoresDeCierre().size()==1){
            return true;
        }else {
            for (int j=1;j<i.getValoresDeCierre().size();j++){
                if (actual<=i.getValoresDeCierre().get(j)){
                    return false;
                }
            }return true;
        }
    }
}
