package TP6.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    ArrayList<Item> itemsAlquilados;

    public Cliente(){
        itemsAlquilados = new ArrayList<>();
    }

    public ArrayList<Item> getItemsAlquilados() {
        return itemsAlquilados;
    }
}