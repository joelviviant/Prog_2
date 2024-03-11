package ParcialesFinales.parcialViajes;

public class FiltroAnd extends Filtro{

    Filtro f1;
    Filtro f2;

        public FiltroAnd(Filtro f1, Filtro f2){
            this.f1=f1;
            this.f2=f2;
        }
    @Override
    public boolean cumple(PaqueteGeneral p) {
        return f1.cumple(p)&& f2.cumple(p);
    }
}
