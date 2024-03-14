package ParcialesFinales.finalBetular;

import ParcialesFinales.finalBetular.Criterio.Criterio;

import java.util.ArrayList;

public class EstacionTrabajo {

String id;
    Criterio criterio;

    ArrayList<ElementoComida> comidas;

    public EstacionTrabajo(Criterio criterio,String id) {
        this.criterio = criterio;
        this.id=id;
        comidas=new ArrayList<>();
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public boolean aceptarPedido(ElementoComida c){
        return criterio.acepta(c);
    }

    public void tomarPedido(ElementoComida c){
        comidas.add(c);
    }
}
