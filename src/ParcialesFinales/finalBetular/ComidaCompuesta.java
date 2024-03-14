package ParcialesFinales.finalBetular;

import java.time.LocalTime;
import java.util.ArrayList;

public class ComidaCompuesta extends ElementoComida{

    ArrayList<ElementoComida> comidasNecesarias;

    public ComidaCompuesta(String nombre) {
        super(nombre);
        comidasNecesarias=new ArrayList<>();
    }

    @Override
    public double getCalorias() {
         double total=0;
         for (ElementoComida c: comidasNecesarias){
             total+=c.getCalorias();
         }
         return total;
    }

    @Override
    public double getPrecio() {
        double total=0;
        for (ElementoComida c: comidasNecesarias){
            total+=c.getPrecio();
        }
        return total;
    }

    @Override
    public int getTiempoDeCoccion() {
        int total=0;
        for (ElementoComida c: comidasNecesarias){
            total+=c.getTiempoDeCoccion();
        }
        return total;
    }

    @Override
    public ArrayList<String> getModoDePreparacion() {
        ArrayList<String>result = new ArrayList<>();
        for (ElementoComida e: comidasNecesarias){
            result.addAll(e.getModoDePreparacion());
        }
        return result;
    }

    public ArrayList<String> getTipoDeComida() {
        ArrayList<String> result = new ArrayList<>();
        for (ElementoComida e : comidasNecesarias) {
            result.addAll(e.getTipoDeComida());
        }
        return result;
    }
}
