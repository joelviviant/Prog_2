package TP5.ejercicio3;

import java.util.ArrayList;

public class Cereal extends Elemento{
    private  String nombre;

    public boolean acepta(Lote lote){
        for (String m: getMinerales()){
           if (!lote.contieneMineral(m)){
               return false;
           }
        }
        return true;
    }

}
