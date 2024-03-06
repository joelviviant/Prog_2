package Tp8.ejercicio6;

import java.util.ArrayList;

public class GrupoBuzon extends ElementoBuzon{

    ArrayList<ElementoBuzon> elementosBuzon;

    public GrupoBuzon(){
        elementosBuzon =new ArrayList<>();
    }


    @Override
    public double buscarPorcentaje(Criterio criterio) {
        int total=0;
        for (ElementoBuzon e: elementosBuzon){
            e.buscarPorcentaje(criterio);
            total++;
        }
        return total/ elementosBuzon.size()*100;
    }

    @Override
    public int buscarCantidadRegalos(Criterio criterio) {
        int total=0;
        for (ElementoBuzon e: elementosBuzon){
            e.buscarCantidadRegalos(criterio);
            total++;
        }
        return total;
    }

    @Override
    public int buscarCantidadNiños(Criterio criterio) {
        int total=0;
        for (ElementoBuzon e: elementosBuzon){
            e.buscarCantidadNiños(criterio);
            total++;
        }
        return total;
    }

    @Override
    public int getTotalCartas() {
        int total=0;
        for (ElementoBuzon e:elementosBuzon){
            total += e.getTotalCartas();
        }
        return total;
    }
}
