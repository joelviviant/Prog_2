package Tp8.ejercicio6;

public class CriterioRegalo implements Criterio{

    String regalo;

    public CriterioRegalo(String regalo) {
        this.regalo = regalo;
    }

    @Override
    public boolean cumple(Carta c) {
        return c.getRegalos().contains(regalo);
    }
}
