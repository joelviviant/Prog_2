package ParcialesFinales.parcialViajes;

public class FiltroNot extends Filtro{
    Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    @Override
    public boolean cumple(PaqueteGeneral p) {
        return !f1.cumple(p);
    }
}
