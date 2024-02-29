package Tp7.ejercicio5;

public class CriterioNombreCientifico implements Criterio{

    String palabra;

    public CriterioNombreCientifico(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getNombreCientifico().equals(palabra);
    }
}
