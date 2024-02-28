package Tp7.ejercicio4;

public class CriterioContenidoMInimo implements Criterio{

    @Override
    public boolean cumple(Documento d) {
        String texto = d.getContenidoTextual() ;
        String[] palabras =texto.split(" ");
        if (palabras.length>20){
            return true;
        }
        return false;
    }


}
