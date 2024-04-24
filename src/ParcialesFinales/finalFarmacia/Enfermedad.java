package ParcialesFinales.finalFarmacia;

import java.util.ArrayList;

public class Enfermedad {
    String nombre;
    ArrayList<String> estadoPatologico;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        estadoPatologico= new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadoPatologico() {
        return new ArrayList<>(estadoPatologico);
    }
}
