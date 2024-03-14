package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioModoPreparacion extends Criterio{

    String modoAceptable;

    public CriterioModoPreparacion(String modoAceptable) {
        this.modoAceptable = modoAceptable;
    }

    @Override
    public boolean acepta(ElementoComida c) {
        return c.getModoDePreparacion().equals(modoAceptable);
    }
}
