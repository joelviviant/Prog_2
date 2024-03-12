package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroCierreMayor extends Filtro {

    int valorCierreRequerido;

    public FiltroCierreMayor(int valorCierreRequerido){
        this.valorCierreRequerido=valorCierreRequerido;
    }

    @Override
    public boolean cumple(InversionGeneral i) {
        return i.getValoresDeCierre().getLast()>valorCierreRequerido;
    }
}
