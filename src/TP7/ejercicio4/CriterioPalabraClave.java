package TP7.ejercicio4;

 public class CriterioPalabraClave extends Criterio{
    String palabraClave;

    public CriterioPalabraClave(String palabraClave){
        this.palabraClave=palabraClave;


    }

     @Override
     public boolean cumple(Documento d) {
         return false;
     }
 }
