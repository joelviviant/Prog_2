package ParcialesFinales.finalBetular;

import java.util.ArrayList;

public class Pedido {
    ArrayList<ElementoComida> comidas;
    int numeroDeMesa;
    String mozo;

    Cocina cocina;

    public Pedido(int numeroDeMesa, String mozo) {
        this.numeroDeMesa = numeroDeMesa;
        this.mozo = mozo;
        comidas=new ArrayList<>();
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public ArrayList<ElementoComida> getComidas() {
        return new ArrayList<>(comidas);
    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public String getMozo() {
        return mozo;
    }

    public double getCostoPedido(){
        Calculadora calc = cocina.getCalc();
        double suma =0;
        for (ElementoComida c: comidas){
           suma+=calc.getPrecio(c);
        }
        return suma;
    }
}
