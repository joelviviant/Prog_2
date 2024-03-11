package ParcialesFinales.parcialViajes;

public class FiltroCosto extends Filtro{
    double costo;

    public FiltroCosto(double costo){
        this.costo=costo;
    }

    @Override
    public boolean cumple(PaqueteGeneral p) {
        return p.getCosto()>costo;
    }

}
