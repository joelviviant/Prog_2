package Tp7.ejercicio1;

import java.util.ArrayList;
import java.util.Objects;

public class Palabra {
    private String palabra;
    private String funcionGramatical;
    private ArrayList<String> definiciones;
    private ArrayList<String> sinonimos;
    private ArrayList<String> antonimos;

    public Palabra(String palabra, String funcionGramatical){
        this.palabra= palabra;
        this.funcionGramatical = funcionGramatical;
        definiciones = new ArrayList<>();
        sinonimos = new ArrayList<>();
        antonimos=new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra1 = (Palabra) o;
        return Objects.equals(palabra, palabra1.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    public String getPalabra() {
        return palabra;
    }

    public ArrayList<String> getSinonimos(){
        return new ArrayList<>(sinonimos);
    }

    public ArrayList<String> getAntonimos(){
        return new ArrayList<>(antonimos);
    }
}
