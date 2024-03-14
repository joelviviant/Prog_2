package ParcialesFinales.finalAlbum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Fotografia extends ElementoFotografico{

    int  ID;
    String titulo;
    double peso;
    ArrayList<String>  personasQueAparecen;
    LocalDate fechaCaptura;
    String comentarios;

    public Fotografia(int ID, String titulo, double peso, LocalDate fechaCaptura, String comentarios) {
        this.ID = ID;
        this.titulo = titulo;
        this.peso = peso;
        this.fechaCaptura = fechaCaptura;
        this.comentarios = comentarios;
        personasQueAparecen = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> addPersonaQueAparece(String persona){
        if (!personasQueAparecen.contains(persona)){
            personasQueAparecen.add(persona);
        }return  personasQueAparecen;
    }

    public ArrayList<String> deletePersonaQueAparece(String persona){
        if (personasQueAparecen.contains(persona)){
            personasQueAparecen.remove(persona);
        }return  personasQueAparecen;
    }

    public LocalDate getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(LocalDate fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    @Override
    public double calcularPeso() {
        return peso;
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public ArrayList<String> getPersonas() {
        return new ArrayList<>(personasQueAparecen);
    }


}
