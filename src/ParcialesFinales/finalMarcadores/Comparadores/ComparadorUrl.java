package ParcialesFinales.finalMarcadores.Comparadores;

import ParcialesFinales.finalMarcadores.Marcador;

import java.util.Comparator;

public class ComparadorUrl extends ComparadorMarcadores {
    @Override
    public int comparar(Marcador m1, Marcador m2) {
        return m1.getUrl().compareTo(m2.getUrl());
    }

}
