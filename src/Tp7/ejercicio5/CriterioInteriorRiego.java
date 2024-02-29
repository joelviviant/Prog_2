package Tp7.ejercicio5;

public class CriterioInteriorRiego implements Criterio{

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getProsperacion().equals("interior") && f.getRiego()>3;
    }
}

