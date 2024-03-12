package ParcialesFinales.finalBanavest;

public class FiltroVariacion extends Filtro{

    @Override
    public boolean cumple(InversionGeneral i) {
        return  i.getVariacion()>0;
    }
}
