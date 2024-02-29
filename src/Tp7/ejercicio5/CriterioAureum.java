package Tp7.ejercicio5;

public class CriterioAureum extends ComparadorFichas implements Criterio{

    String palabra = "aureum";


    @Override
    public int comparar(FichaPlanta ficha1, FichaPlanta ficha2) {
        return 0;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getNombreCientifico().equals(palabra);
    }
}
