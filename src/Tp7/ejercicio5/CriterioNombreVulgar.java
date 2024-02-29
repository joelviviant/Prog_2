package Tp7.ejercicio5;

public class CriterioNombreVulgar implements Criterio{

    String palabra;

    public CriterioNombreVulgar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getNombresVulgares().equals(palabra);
    }
}


