package ParcialesFinales.finalMarcadores.Filtro;
import ParcialesFinales.finalMarcadores.ElementoMarcador;
import ParcialesFinales.finalMarcadores.Marcador;

public class FiltroPalabraClave extends Filtro{
    String palabraClave;

    public FiltroPalabraClave(String palabraClave){
        this.palabraClave=palabraClave;
    }

    @Override
    public boolean cumple(Marcador m) {
        return m.getPalabrasClave().contains(palabraClave);
    }


}
