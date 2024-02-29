package Tp7.ejercicio5;

public class CriterioSolRiego implements Criterio {

    int sol;
    int riego;

    public CriterioSolRiego(int sol, int riego) {
        this.sol = sol;
        this.riego = riego;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getSol()>5 && f.getRiego()<3;
    }
}
