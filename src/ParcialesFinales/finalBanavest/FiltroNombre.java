package ParcialesFinales.finalBanavest;

public class FiltroNombre extends Filtro{
    String nombre;

    public FiltroNombre(String nombre){
        this.nombre= nombre;
    }

    @Override
    public boolean cumple(InversionGeneral i) {
        return i.getNombre().equals(nombre);
    }
}
