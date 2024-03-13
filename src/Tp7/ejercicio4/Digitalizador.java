package Tp7.ejercicio4;

import java.util.ArrayList;

public class Digitalizador {
    ArrayList<Documento> documentos;

    public Digitalizador(){
        documentos = new ArrayList<>();
    }

    public ArrayList<Documento> buscar(Criterio criterio){
         ArrayList<Documento> docCumplidores = new ArrayList<>();
         for ( Documento d: documentos){
             if (criterio.cumple(d)){
                 docCumplidores.add(d);
             }
        }
         return docCumplidores;
    }


}
