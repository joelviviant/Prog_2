package Tp7.ejercicio5;

import java.util.Comparator;

public abstract class ComparadorFichas implements Comparator<FichaPlanta> {
    private ComparadorFichas siguiente;

    public ComparadorFichas() {
        siguiente = null;
    }

    public ComparadorFichas(ComparadorFichas siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(FichaPlanta ficha1, FichaPlanta ficha2);

    @Override
    public int compare(FichaPlanta ficha1, FichaPlanta ficha2) {
        int res = this.comparar(ficha1,ficha2);
        if (res==0){
            if (siguiente!=null)
                return siguiente.compare(ficha1, ficha2);
            else
                return 0;
        }
        return res;
    }

}