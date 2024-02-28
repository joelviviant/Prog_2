package Tp7.ejercicio4;

 public class CriterioPalabraClave implements Criterio{
    String palabraClave;

    public CriterioPalabraClave(String palabraClave){
        this.palabraClave=palabraClave;
    }

     @Override
     public boolean cumple(Documento d) {
         return d.getPalabrasClave().contains(palabraClave);
     }
 }
