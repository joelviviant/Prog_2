package ParcialesFinales.finalBetular;

import ParcialesFinales.finalBetular.Criterio.Criterio;

public  abstract class Calculadora {

    Criterio c;

    public  Calculadora(Criterio c){
        this.c=c;
    }

    public abstract double getPrecio(ElementoComida comida);
}
