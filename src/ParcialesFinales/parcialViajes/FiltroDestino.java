package ParcialesFinales.parcialViajes;

public class FiltroDestino extends Filtro{
    String destino;

    public FiltroDestino(String destino){
        this.destino=destino;
    }


    @Override
    public boolean cumple(PaqueteGeneral p) {
        return p.getDestino().equals(destino);
    }
}
