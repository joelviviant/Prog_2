package Tp7.ejercicio1;

import java.util.ArrayList;

public class Diccionario {

    private ArrayList<Palabra> palabras;

    public boolean addPalabra(Palabra palabra){
        if (!palabras.contains(palabra)){
            palabras.add(palabra);
            return true;
        }return false;
    }

    public boolean deletePalabra(Palabra palabra){
        return palabras.remove(palabra);
    }

    public boolean modifyPalabra(Palabra palabra){
        int pos = palabras.indexOf(palabra);
        if (pos>=0){
            palabras.set(pos, palabra);
            return true;
        }
       return false;
    }

    public ArrayList<String> obtenerSinonimos(String palabra){
        for(Palabra p:palabras){
            if (p.getPalabra().equalsIgnoreCase(palabra)){
                ArrayList<String> sinonimos = p.getSinonimos();
                sinonimos.sort(((o1, o2) -> o1.compareTo(o2)));
                return sinonimos;
            }
        }return null;
    }

    public ArrayList<String> obtenerAntonimos(String palabra){
        for(Palabra p:palabras){
            if (p.getPalabra().equalsIgnoreCase(palabra)){
                ArrayList<String> antonimos = p.getAntonimos();
                antonimos.sort(((o1, o2) -> o1.compareTo(o2)));
                return antonimos;
            }
        }return null;
    }



}
