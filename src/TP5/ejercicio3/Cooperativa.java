package TP5.ejercicio3;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<String> mineralesPrimarios;
    private ArrayList<String> mineralesSecundarios;

    public boolean esEspecial(Lote lote){
        for (String m: mineralesPrimarios){
            if (lote.contieneMineral(m)){
                return true;
            }
        }
        return false;
    }
}
