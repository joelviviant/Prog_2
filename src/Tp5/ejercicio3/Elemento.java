package Tp5.ejercicio3;

import java.util.ArrayList;

public class Elemento {
    private ArrayList<String> minerales;


    public Elemento() {
    }

    public void agregarMineral(String mineral){
        this.minerales.add(mineral.toLowerCase());
    }

    public ArrayList<String> getMinerales(){
        return new ArrayList<>(this.minerales);
    }

    public boolean contieneMineral(String mineral){
        return this.minerales.contains(mineral);
    }
}
