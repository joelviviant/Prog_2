package Tp8.ejercicio7;

import java.util.Comparator;
import java.util.Objects;

public class Candidato  {
    private String nombre;
    private String partidoPolitico;
    private String Agrupacion ;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        Agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getAgrupacion() {
        return Agrupacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(nombre, candidato.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
