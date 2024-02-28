package Tp5.ejercicio3;

public class CerealPastura extends Cereal{

    @Override
    public boolean acepta(Lote lote) {
        return lote.getHectareas()>= 50 && super.acepta(lote);
    }
}
