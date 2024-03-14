package ParcialesFinales.finalBetular;

import java.time.LocalTime;
import java.util.ArrayList;

public class ComidaSimple extends ElementoComida{

    String tipoDeComida;
    String modoDePreparacion;
    double calorias;
    double precio;
    int tiempoDeCoccion;

    public ComidaSimple(String nombre, String tipoDeComida, String modoDePreparacion, double calorias, double precio, int tiempoDeCoccion) {
        super(nombre);
        this.tipoDeComida = tipoDeComida;
        this.modoDePreparacion = modoDePreparacion;
        this.calorias = calorias;
        this.precio = precio;
        this.tiempoDeCoccion = tiempoDeCoccion;
    }

    public ArrayList<String> getTipoDeComida(){
        ArrayList<String>result = new ArrayList<>();
        result.add(tipoDeComida);
        return result;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public ArrayList<String> getModoDePreparacion() {
        ArrayList<String>result = new ArrayList<>();
        result.add(modoDePreparacion);
        return result;
    }

    public void setModoDePreparacion(String modoDePreparacion) {
        this.modoDePreparacion = modoDePreparacion;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempoDeCoccion() {
        return tiempoDeCoccion;
    }

    public void setTiempoDeCoccion(int tiempoDeCoccion) {
        this.tiempoDeCoccion = tiempoDeCoccion;
    }
}
