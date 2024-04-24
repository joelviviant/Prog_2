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
    public ArrayList<ElementoDroga> medicamentosAptos(Enfermedad enfermedad) {
        ArrayList<ElementoDroga> medicamentos = new ArrayList<>();
    }
}
