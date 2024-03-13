package ParcialesFinales.finalMarcadores.Filtro;

import ParcialesFinales.finalMarcadores.Marcador;

public class FiltroUsuario extends Filtro{

    String usuario;

    public FiltroUsuario(String usuario){
        this.usuario=usuario;
    }


    @Override
    public boolean cumple(Marcador m) {
        return m.getUsuario().equalsIgnoreCase(usuario);
    }
}
