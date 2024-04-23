package ParcialesFinales.finalFarmacia;

import java.util.ArrayList;

public class DrogaSimple extends ElementoDroga{


    public DrogaSimple(String nombre) {
        super(nombre);
    }

    @Override
    public void addAccionesTerapeuticas(String accionTerapeutica) {
        if (!accionesTerapeuticas.contains(accionTerapeutica)) {
            accionesTerapeuticas.add(accionTerapeutica);
        }else{
            System.out.println("La accion terapeutica esta en la lista de terapeuticas");
        }
    }

    @Override
    public void addContraindicaciones(String contraindicacion) {
        if (!contraindicaciones.contains(contraindicacion)) {
            contraindicaciones.add(contraindicacion);
        }else{
            System.out.println("La contraindicacion esta en la lista de contraindicaciones");
        }
    }

    @Override
    public ArrayList<String> getAccionesTerapeuticas() {
        return new ArrayList<>(accionesTerapeuticas);
    }

    @Override
    public ArrayList<String> getContraindicaciones() {
        return new ArrayList<>(contraindicaciones);
    }
}
