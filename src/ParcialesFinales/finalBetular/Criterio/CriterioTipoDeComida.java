package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioTipoDeComida extends Criterio{

    String tipoAceptable;

    public CriterioTipoDeComida(String tipoAceptable) {
        this.tipoAceptable = tipoAceptable;
    }

    @Override
    public boolean acepta(ElementoComida c) {
        return c.getTipoDeComida().equals(tipoAceptable);
    }

}
