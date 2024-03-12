package ParcialesFinales.finalBanavest;

public class FiltroVariacionIgual extends  Filtro{

    @Override
    public boolean cumple(InversionGeneral i) {
        return  i.getVariacion()==0;
    }

}
