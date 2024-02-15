package clase20210928.personas;


import clase20210928.ej2tp6.ElementoCola;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona implements ElementoCola{
    private int legajo;
    private ArrayList<String> materiasAprobadas;

    public Alumno(String nombre, LocalDate nacimiento, int legajo, int cantHijos) {
        super(nombre, nacimiento, cantHijos);
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public int getLegajo(){
        return legajo;
    }

    public int cantMateriasAprobadas(){
        return materiasAprobadas.size();
    }

    public void agregarMateriaAprobada(String materia){
        materiasAprobadas.add(materia);
    }

    @Override
    public boolean esMayor(ElementoCola otro){
        return this.getLegajo() > ((Alumno)otro).getLegajo();
    }
}
