package Tp7.ejercicio4;

public class CriterioOr implements Criterio{

    Tp7.ejercicio4.Criterio criterio1;
    Tp7.ejercicio4.Criterio criterio2;

    public CriterioOr(Criterio criterio1, Criterio criterio2){
        this.criterio1=criterio1;
        this.criterio2=criterio2;
    }
    @Override
    public boolean cumple(Documento d) {
        return criterio1.cumple(d) || criterio2.cumple(d);
    }
}
