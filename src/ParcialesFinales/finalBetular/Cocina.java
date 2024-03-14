package ParcialesFinales.finalBetular;

import java.util.ArrayList;

public class Cocina {

    ArrayList<EstacionTrabajo> estaciones;
    Calculadora calc;

    public void agregarEstacion(EstacionTrabajo e){
        estaciones.add(e);
    }

    public void setCalc(Calculadora calc) {
        this.calc = calc;
    }
    public Calculadora  getCalc(){
        return calc;
    }

    public void tomarPedido(Pedido pedido){
        for (ElementoComida c : pedido.getComidas()){
            for (EstacionTrabajo e: estaciones){
                if (e.aceptarPedido(c)){
                    e.tomarPedido(c);
                    break;
                }
            }
        }
    }


}
