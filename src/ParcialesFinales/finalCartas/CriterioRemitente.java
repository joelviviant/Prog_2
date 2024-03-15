package ParcialesFinales.finalCartas;

public class CriterioRemitente extends Criterio{
    Persona  remitente;


    public CriterioRemitente(Persona remitente){
        this.remitente=remitente;
    }
    @Override
    public boolean cumple(ElementoEnvio e) {
        return e.getRemitente().equals(remitente);
    }
}
