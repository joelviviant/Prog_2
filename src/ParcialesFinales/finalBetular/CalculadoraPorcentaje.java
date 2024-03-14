package ParcialesFinales.finalBetular;

import ParcialesFinales.finalBetular.Criterio.Criterio;

public class CalculadoraPorcentaje extends Calculadora{

    double porcentaje;

    public CalculadoraPorcentaje(Criterio c, double porcentaje) {
        super(c);
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPrecio(ElementoComida comida) {
      if (c.acepta(comida)){
          return comida.getPrecio()+ comida.getPrecio()*porcentaje/100;
      }
        return comida.getPrecio();
    }
}
