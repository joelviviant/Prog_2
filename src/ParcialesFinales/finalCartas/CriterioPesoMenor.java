package ParcialesFinales.finalCartas;

public class CriterioPesoMenor extends Criterio{
    double peso;

    public CriterioPesoMenor(double peso){
        this.peso=peso;
    }

    @Override
    public boolean cumple(ElementoEnvio e) {
        return e.getPeso()<peso;
    }
}
