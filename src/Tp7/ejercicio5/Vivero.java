package Tp7.ejercicio5;

import Tp7.ejercicio4.Documento;

import java.util.ArrayList;
import java.util.Collections;

public class Vivero {

    ArrayList<FichaPlanta> fichas;
    ArrayList<FichaPlanta> fichasCumplidoras;


    public Vivero(){
        fichas = new ArrayList<>();
        fichasCumplidoras = new ArrayList<>();
    }

    public ArrayList<FichaPlanta> buscar(Criterio criterio){
        for ( FichaPlanta f: fichas){
            if (criterio.cumple(f)){
                fichasCumplidoras.add(f);
            }
        }
        return fichasCumplidoras;
    }

    public void ordenarFichasSegunCriterio(ArrayList<FichaPlanta> fichasCumplidoras, ComparadorFichas comparador) {
        Collections.sort(fichasCumplidoras, comparador);
    }



}
