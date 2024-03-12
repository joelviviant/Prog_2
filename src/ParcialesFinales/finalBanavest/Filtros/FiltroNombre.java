package ParcialesFinales.finalBanavest.Filtros;

import ParcialesFinales.finalBanavest.Filtros.Filtro;
import ParcialesFinales.finalBanavest.InversionGeneral;

public class FiltroNombre extends Filtro {
    String nombre;

    public FiltroNombre(String nombre){
        this.nombre= nombre;
    }

    @Override
    public boolean cumple(InversionGeneral i) {
        return i.getNombre().contains(nombre);
    }
}
