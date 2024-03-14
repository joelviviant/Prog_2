package ParcialesFinales.finalBetular;

import ParcialesFinales.finalBetular.Criterio.Criterio;

public class CalculadoraSuma extends Calculadora{

    double montoTrue;
    double montoFalse;

    public CalculadoraSuma(Criterio c, double montoTrue, double montoFalse) {
        super(c);
        this.montoTrue = montoTrue;
        this.montoFalse = montoFalse;
    }

    @Override
    public double getPrecio(ElementoComida comida) {
        if (c.acepta(comida)){
            return comida.getPrecio()+montoTrue;
        }else{
            return comida.getPrecio()+montoFalse;
        }
    }
}

