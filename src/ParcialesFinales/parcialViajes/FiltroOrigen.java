package ParcialesFinales.parcialViajes;

public class FiltroOrigen extends Filtro{

    String origen;

    public FiltroOrigen(String origen){
        this.origen=origen;
    }

    @Override
    public boolean cumple(PaqueteGeneral p) {
        return p.getOrigen().equals(origen);
    }
}
