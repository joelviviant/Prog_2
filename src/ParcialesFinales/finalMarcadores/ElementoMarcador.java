package ParcialesFinales.finalMarcadores;

import ParcialesFinales.finalBanavest.InversionGeneral;
import ParcialesFinales.finalMarcadores.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoMarcador {
    public abstract ElementoMarcador copia(Filtro f1);

    public abstract  ArrayList<Marcador> buscar(Filtro f1);

    public ArrayList<Marcador> buscar(Filtro f1, Comparator<Marcador> c1){
        ArrayList<Marcador> resultado = new ArrayList<>();
        Collections.sort(resultado,c1);
        return resultado;
    }

    public abstract ArrayList<String> getPalabrasClave();

    public abstract  int contarMarcadores();
}
