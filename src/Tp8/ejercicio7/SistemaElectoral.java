package Tp8.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaElectoral {
    ArrayList<Candidato> candidatos;

    public SistemaElectoral(){
        candidatos = new ArrayList<>();
    }

    public ArrayList<Candidato> getCandidatos(ComparadorCandidato comparadorCandidato){
        ArrayList<Candidato> candidatosOrdenados= new ArrayList<>(candidatos);
        Collections.sort(candidatosOrdenados,comparadorCandidato);
        return  candidatosOrdenados;
    }
}
