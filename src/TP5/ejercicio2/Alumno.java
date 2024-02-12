package TP5.ejercicio2;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private  ArrayList<Habilidad> habilidades;
    private ArrayList<Alumno> familia;
    private Casa casa;


    public Alumno(String nombre) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }


    public boolean contieneHabilidad(Habilidad habilidad){
        return  habilidades.contains(habilidad);
    }

    public boolean contieneFamiliar(Alumno familiar){
        return this.familia.contains(familiar);
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Casa getCasa() {
        return casa;
    }
}
