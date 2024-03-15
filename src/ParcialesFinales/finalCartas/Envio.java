package ParcialesFinales.finalCartas;

import java.util.ArrayList;

public class Envio extends  ElementoEnvio{

    Persona destinatario;
    Persona remitente;

    boolean seRetiraEnSucursal;
    double peso;

    public Envio(int nroTracking, Persona destinatario, Persona remitente, boolean seRetiraEnSucursal, double peso) {
        super(nroTracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.seRetiraEnSucursal = seRetiraEnSucursal;
        this.peso = peso;
    }


    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }



    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }


    public boolean isSeRetiraEnSucursal() {
        return seRetiraEnSucursal;
    }

    public void setSeRetiraEnSucursal(boolean seRetiraEnSucursal) {
        this.seRetiraEnSucursal = seRetiraEnSucursal;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public ArrayList<ElementoEnvio> buscar(Criterio c) {
        ArrayList<ElementoEnvio> cumplidores = new ArrayList<>();
        if (c.cumple(this)){
            cumplidores.add(this);
        }
        return cumplidores;
    }

    @Override
    public ElementoEnvio copia(Criterio c) {
        if (c.cumple(this)){
            return new Envio(this.getNroTracking(),this.getDestinatario(),this.getRemitente(),this.isSeRetiraEnSucursal(),this.getPeso());
        }
        return null;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



    @Override
    public Direccion getDireccionDestinatario() {
        return destinatario.getDireccion();
    }

    @Override
    public Direccion getDireccionRemitente() {
        return remitente.getDireccion();
    }
}
