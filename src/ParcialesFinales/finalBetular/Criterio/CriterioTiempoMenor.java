package ParcialesFinales.finalBetular.Criterio;

import ParcialesFinales.finalBetular.ElementoComida;

public class CriterioTiempoMenor extends Criterio {

    int tiempoSolicitado;

    public CriterioTiempoMenor(int tiempoSolicitado) {
        this.tiempoSolicitado = tiempoSolicitado;
    }

    @Override
    public boolean acepta(ElementoComida c) {
        return c.getTiempoDeCoccion() > tiempoSolicitado;
    }
}
