package ParcialesFinales.finalMarcadores.Filtro;

import ParcialesFinales.finalMarcadores.ElementoMarcador;
import ParcialesFinales.finalMarcadores.Marcador;

public class FiltroUrl extends Filtro{

    String url;

    public FiltroUrl(String url){
        this.url=url;
    }

    @Override
    public boolean cumple(Marcador m) {
        return m.getUrl().equalsIgnoreCase(url);
    }
}
