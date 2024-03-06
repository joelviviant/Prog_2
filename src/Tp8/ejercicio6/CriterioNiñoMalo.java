package Tp8.ejercicio6;

public class CriterioNiñoMalo implements Criterio{

    String regaloMalo;

    @Override
    public boolean cumple(Carta c) {
        return c.getRegalos().contains(regaloMalo);
    }
}
