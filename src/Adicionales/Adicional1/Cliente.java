package Adicionales.Adicional1;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private ArrayList<String> autoresFav;
    private ArrayList<String> generosFav;
    private ArrayList<Elemento> compras;
    double descuento;

    public double getDescuento() {
        return descuento;
    }

    public boolean compro(Elemento elemento){
        return compras.contains(elemento);
    }
    public boolean leGusta(Elemento elemento){
        return autoresFav.contains(elemento);
    }

    public ArrayList<String> getGenerosFav(){
        return new ArrayList<>(this.generosFav);
    }
}
