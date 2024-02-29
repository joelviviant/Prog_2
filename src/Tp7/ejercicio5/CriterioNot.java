package Tp7.ejercicio5;


public class CriterioNot implements Criterio {

    Tp7.ejercicio5.Criterio criterio1;
    Tp7.ejercicio5.Criterio criterio2;

    public CriterioNot(Tp7.ejercicio5.Criterio criterio1, Tp7.ejercicio5.Criterio criterio2){
        this.criterio2=criterio1;
        this.criterio2=criterio2;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return !criterio1.cumple(f);
    }
}