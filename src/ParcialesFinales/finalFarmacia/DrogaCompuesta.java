package ParcialesFinales.finalFarmacia;

import java.util.ArrayList;

public class DrogaCompuesta extends ElementoDroga{

    ArrayList<ElementoDroga> drogas;

    public DrogaCompuesta(String nombre) {
        super(nombre);
    }


    @Override
    public void addAccionesTerapeuticas(String accionTerapeutica) {

    }

    @Override
    public void addContraindicaciones(String contraindicacion) {

    }

    @Override
    public ArrayList<String> getAccionesTerapeuticas() {
        return null;
    }

    @Override
    public ArrayList<String> getContraindicaciones() {
        return null;
    }
}
