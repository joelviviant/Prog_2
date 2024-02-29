package Tp7.ejercicio5;

public class CriterioClasificacion implements Criterio{
    String palabra;

    public CriterioClasificacion(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(FichaPlanta f) {
        return f.getClasificacionSuperior().equals(palabra);
    }
}
