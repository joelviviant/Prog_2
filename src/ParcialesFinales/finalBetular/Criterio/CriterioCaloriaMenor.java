package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioCaloriaMenor extends Criterio{

    int calorias;

    public CriterioCaloriaMenor(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean acepta(ElementoComida c) {
        return c.getCalorias()<calorias;
    }

}
