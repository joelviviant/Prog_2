package ParcialesFinales.finalBanavest;

public class FiltroCierreMayor extends Filtro{

    int valorCierreRequerido;

    public FiltroCierreMayor(int valorCierreRequerido){
        this.valorCierreRequerido=valorCierreRequerido;
    }

    @Override
    public boolean cumple(InversionGeneral i) {
        return i.valoresDeCierre.getLast()>valorCierreRequerido;
    }
}
