package ParcialesFinales.finalCartas;

public class CriterioCiudadDestino extends Criterio{

    String  ciudad;


    public CriterioCiudadDestino(String ciudad){
        this.ciudad=ciudad;
    }
    @Override
    public boolean cumple(ElementoEnvio e) {
        return e.getDireccionDestinatario().getCiudad().equalsIgnoreCase(ciudad);
    }
}
