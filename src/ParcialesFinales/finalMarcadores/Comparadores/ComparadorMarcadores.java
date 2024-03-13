package ParcialesFinales.finalMarcadores.Comparadores;

import ParcialesFinales.finalMarcadores.Marcador;
import Tp7.ejercicio5.ComparadorFichas;
import Tp7.ejercicio5.FichaPlanta;

import java.util.Comparator;

public abstract class ComparadorMarcadores implements Comparator<Marcador> {

    private ComparadorMarcadores siguiente;

    public ComparadorMarcadores() {
        siguiente = null;
    }

    public ComparadorMarcadores(ComparadorMarcadores siguiente) {
        this.siguiente = siguiente;
    }

    public abstract int comparar(Marcador m1, Marcador m2);

    @Override
    public int compare(Marcador m1, Marcador m2) {
        int res = this.comparar(m1,m2);
        if (res==0){
            if (siguiente!=null)
                return siguiente.compare(m1, m2);
            else
                return 0;
        }
        return res;
    }
}
