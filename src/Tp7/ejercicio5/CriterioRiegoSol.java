package Tp7.ejercicio5;

public class CriterioRiegoSol implements Criterio{

    int sol;
    int riego;

    public CriterioRiegoSol(int sol, int riego) {
        this.sol = sol;
        this.riego = riego;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getSol()>4 && f.getRiego()<4;
    }
}

