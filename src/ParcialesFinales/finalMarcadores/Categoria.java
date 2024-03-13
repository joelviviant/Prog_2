package ParcialesFinales.finalMarcadores;

import ParcialesFinales.finalMarcadores.Filtro.Filtro;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Categoria extends ElementoMarcador{
  String  nombre;
  String descripcion;
  ArrayList<ElementoMarcador> categorias;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        categorias=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void add(ElementoMarcador e){
        if (!categorias.contains(e))
            categorias.add(e);
    }

    public ArrayList<ElementoMarcador> getCategorias() {
        return new ArrayList<>(categorias);
    }

    public ElementoMarcador  copia(Filtro f){
        Categoria copia = new Categoria(this.getNombre(),this.getDescripcion());
        for (ElementoMarcador c:categorias) {
            ElementoMarcador copiaHijo= c.copia(f);
            if (copiaHijo!=null){
                copia.add(copiaHijo);
            }
        }return copia;
    }

    @Override
    public ArrayList<Marcador> buscar(Filtro f1) {
        ArrayList<Marcador> resultado = new ArrayList<>();
        for (ElementoMarcador e : categorias) {
            resultado.addAll(e.buscar(f1));
        }
        return resultado;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> result = new ArrayList<>();
        for (ElementoMarcador e : categorias) {
            for (String p: e.getPalabrasClave()){
                if (result.contains(p)){
                    result.add(p);
                }
            }

        }
        return result;
    }

    public int getCantidadPalabrasClaves(){
        return getPalabrasClave().size();
    }

    @Override
    public int contarMarcadores() {
        int total=0;
        for (ElementoMarcador e: categorias){
            total+=e.contarMarcadores();
        }
        return total;
    }

}
