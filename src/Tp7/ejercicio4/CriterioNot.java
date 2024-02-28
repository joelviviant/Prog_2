package Tp7.ejercicio4;

public class CriterioNot implements Criterio{

    Criterio criterio1;


    public CriterioNot(Criterio criterio1){
        this.criterio1=criterio1;

    }
    @Override
    public boolean cumple(Documento d) {
        return !criterio1.cumple(d);
    }
}
