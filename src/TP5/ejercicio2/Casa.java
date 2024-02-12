package TP5.ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

public class Casa {
     private String nombre;
    private int max;
    private ArrayList<Habilidad> habilidadesRequeridas;
    private ArrayList<Alumno> alumnos;

    public Casa(String nombre, int max) {
        this.nombre = nombre;
        this.max = max;
        this.habilidadesRequeridas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<Habilidad> getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public boolean aceptarAlumno(Alumno alumno){
       if (alumno.getCasa()!= null && alumnos.size()<max){
           for (Habilidad h: habilidadesRequeridas){
               if (!alumno.contieneHabilidad(h)){
                   return false;
               }
           }
           return true;
       }return false;
    }
    public boolean agregarAlumno(Alumno alumno){
        if(aceptarAlumno(alumno)){
            alumnos.add(alumno);
            alumno.setCasa(this);
            return true;
        }return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return Objects.equals(nombre, casa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
