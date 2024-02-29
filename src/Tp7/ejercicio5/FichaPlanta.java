package Tp7.ejercicio5;

import java.util.ArrayList;

public class FichaPlanta {
    String NombreCientifico;
    ArrayList<String> NombresVulgares;
    String ClasificacionSuperior;
    String Familia;
    String Clase;
    String Prosperacion;
    int Sol;
    int Riego;

    public FichaPlanta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String prosperacion, int sol, int riego) {
        NombreCientifico = nombreCientifico;
        NombresVulgares = new ArrayList<>();
        ClasificacionSuperior = clasificacionSuperior;
        Familia = familia;
        Clase = clase;
        Prosperacion = prosperacion;
        Sol = sol;
        Riego = riego;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<>(NombresVulgares);
    }

    public String getClasificacionSuperior() {
        return ClasificacionSuperior;
    }

    public String getFamilia() {
        return Familia;
    }

    public String getClase() {
        return Clase;
    }

    public String getProsperacion() {
        return Prosperacion;
    }

    public int getSol() {
        return Sol;
    }

    public int getRiego() {
        return Riego;
    }
}
