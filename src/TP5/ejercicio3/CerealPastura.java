package TP5.ejercicio3;

import java.util.ArrayList;

public class CerealPastura extends Cereal{

    @Override
    public boolean acepta(Lote lote) {
        return lote.getHectareas()>= 50 && super.acepta(lote);
    }
}
