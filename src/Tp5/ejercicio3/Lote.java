package Tp5.ejercicio3;

public class Lote extends Elemento{
    int id;
    double hectareas;

    public boolean acepta(Cereal cereal){
       return cereal.acepta(this);
    }

    public double getHectareas() {
        return hectareas;
    }
}
