package Tp8.ejercicio6;

import java.util.ArrayList;

public class Carta {
    Niño remitente;
    ArrayList<String> regalos;

    public Carta(Niño remitente) {
        this.remitente = remitente;
        regalos = new ArrayList<>();
    }

    public void addRegalo(String regalo){
        if (!regalos.contains(regalo)){
            regalos.add(regalo);
        }
    }

    public void esNiñoMalo(){
        regalos.clear();
        regalos.add("Trozo de carbón");
    }

    public Niño getRemitente() {
        return remitente;
    }

    public ArrayList<String> getRegalos() {
        return new ArrayList<>(regalos);
    }
}
