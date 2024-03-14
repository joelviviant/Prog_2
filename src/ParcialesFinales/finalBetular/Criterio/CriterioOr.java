package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioOr extends Criterio{

    Criterio c1;
    Criterio c2;

    public CriterioOr(Criterio c1, Criterio c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public boolean acepta(ElementoComida c) {
        return c1.acepta(c) || c2.acepta(c);
    }
}
