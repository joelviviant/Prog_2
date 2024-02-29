package Tp7.ejercicio5;

public class CriterioAnd implements Criterio {

    Tp7.ejercicio5.Criterio criterio1;
    Tp7.ejercicio5.Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2){
        this.criterio2=criterio1;
        this.criterio2=criterio2;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return criterio1.cumple(f) && criterio2.cumple(f);
    }
}