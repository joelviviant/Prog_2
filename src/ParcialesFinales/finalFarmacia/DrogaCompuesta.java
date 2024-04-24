package ParcialesFinales.finalFarmacia;

import java.util.ArrayList;

public class DrogaCompuesta extends ElementoDroga{

    ArrayList<ElementoDroga> drogas;

    public DrogaCompuesta(String nombre) {
        super(nombre);
        drogas  = new ArrayList<>();
    }

    @Override
    public void addAccionesTerapeuticas(String accionTerapeutica) {
        for(ElementoDroga e : drogas){
            if (!e.getAccionesTerapeuticas().contains(accionTerapeutica)){
                this.accionesTerapeuticas.add(accionTerapeutica);
            }else {
                System.out.println("La accion terapeutica ya existe");
            }
        }
    }

    @Override
    public void addContraindicaciones(String contraindicacion) {
        for (ElementoDroga e : drogas) {
            if (!e.getContraindicaciones().contains(contraindicacion)){
                this.contraindicaciones.add(contraindicacion);
            }else {
                System.out.println("La contraindicacion ya existe");
            }
        }
    }

    @Override
    public ArrayList<String> getAccionesTerapeuticas() {
        ArrayList<String> resultado =  new ArrayList<>();
        for (ElementoDroga d : drogas){
           ArrayList<String> acciones = d.getAccionesTerapeuticas();
           if (!resultado.contains(acciones)){
               resultado.addAll(acciones);
           }
        }
        return resultado;
    }

    @Override
    public ArrayList<String> getContraindicaciones() {
        ArrayList<String> resultado = new ArrayList<>();
        for (ElementoDroga d: drogas){
            ArrayList<String>  contraIndicaciones = d.getContraindicaciones();
            if (!resultado.contains(contraIndicaciones)){
                resultado.addAll(contraIndicaciones);
            }
        }
        return resultado;
    }

}
