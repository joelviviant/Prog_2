package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioNot extends Criterio{

    Criterio c1;

    public CriterioNot(Criterio c1){
        this.c1=c1;

    }
    @Override
    public boolean acepta(ElementoComida c) {
        return !c1.acepta(c);
    }
}