package ParcialesFinales.finalFarmacia;

import java.util.ArrayList;

public abstract class ElementoDroga {
    String nombre;
    double precio;
    ArrayList<String> accionesTerapeuticas;
    ArrayList<String> contraindicaciones;

    public ElementoDroga(String nombre) {
        this.nombre = nombre;
        accionesTerapeuticas = new ArrayList<>();
        contraindicaciones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public abstract double getPrecio();
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void addAccionesTerapeuticas(String accionTerapeutica);
    public abstract void addContraindicaciones(String contraindicacion);
    public abstract ArrayList<String> getAccionesTerapeuticas();
    public abstract ArrayList<String> getContraindicaciones();

}
