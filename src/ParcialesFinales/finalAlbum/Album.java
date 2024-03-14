package ParcialesFinales.finalAlbum;

import java.util.ArrayList;

public class Album extends ElementoFotografico{

    String nombre;
    ArrayList<ElementoFotografico> albumes;


    public Album(String nombre) {
        this.nombre = nombre;
        albumes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

     public void addElemento(ElementoFotografico e){
        if (!albumes.contains(e)){
            albumes.add(e);
        }
     }

    public void deleteElemento(ElementoFotografico e){
        if (albumes.contains(e)){
            albumes.remove(e);
        }
    }

    @Override
    public double calcularPeso() {
        double total =0;
        for (ElementoFotografico e : albumes){
           total+= e.calcularPeso();
        }
        return total;
    }

    @Override
    public int getCantidad() {
        int total =0;
        for (ElementoFotografico e : albumes){
            total+= e.getCantidad();
        }
        return total;
    }

    @Override
    public ArrayList<String> getPersonas() {
        ArrayList<String> personas = new ArrayList<>();
        for (ElementoFotografico e : albumes){
            personas.addAll(e.getPersonas());
        }
        return personas;
    }
}
