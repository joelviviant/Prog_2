package ParcialesFinales.finalMarcadores.Comparadores;

import ParcialesFinales.finalMarcadores.Marcador;

import java.util.Comparator;

public class ComparadorCantPalabrasClaves extends ComparadorMarcadores{
    @Override
    public int comparar(Marcador m1, Marcador m2) {
        return m1.getPalabrasClave().size() - m2.getPalabrasClave().size();
    }

}
