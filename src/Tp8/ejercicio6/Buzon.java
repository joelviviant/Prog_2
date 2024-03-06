package Tp8.ejercicio6;

import java.util.ArrayList;

public class Buzon extends ElementoBuzon{

    ArrayList<Niño> niñosBuenos;
    ArrayList<Carta> cartas;

    public Buzon(){
        niñosBuenos = new ArrayList<>();
        cartas=new ArrayList<>();
    }

    public void addCarta(Carta carta){
        Carta cartaControlada = controlarCarta(carta);
        if (cartaControlada != null) {
            cartas.add(carta);
        }
    }

    public Carta controlarCarta(Carta carta){
        if (niñosBuenos.contains(carta.getRemitente())&& !cartas.contains(carta.getRemitente())){
            return  carta;
        } else if (!niñosBuenos.contains(carta.getRemitente())) {
           carta.esNiñoMalo();
           return carta;
        }
        return null;
    }


    @Override
    public double buscarPorcentaje(Criterio criterio) {
        int total=0;
        for (Carta c:cartas) {
            if (criterio.cumple(c)){
                total++;
            }
        }
        return total/cartas.size()*100;
    }

    public int buscarCantidadRegalos(Criterio criterio){
        int total=0;
        for (Carta c:cartas) {
            if (criterio.cumple(c)){
                total++;
            }
        }
        return total;
    }

    public int buscarCantidadNiños(Criterio criterio){
        int total=0;
        for (Carta c:cartas) {
            if (criterio.cumple(c)){
                total++;
            }
        }
        return total;
    }

    public int getTotalCartas(){
        return cartas.size();
    }
}
