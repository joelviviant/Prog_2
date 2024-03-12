package ParcialesFinales.finalBanavest;

import ParcialesFinales.finalBanavest.Estrategias.Criterio;
import ParcialesFinales.finalBanavest.Filtros.Filtro;

import java.util.ArrayList;

public class InversionCompuesta extends InversionGeneral{
    double porcentajeGastos;
    ArrayList<InversionGeneral> inversiones;
    public InversionCompuesta(String nombre, double porcentajeGastos, Criterio rentabilidad) {
        super(nombre,rentabilidad);
        inversiones = new ArrayList<>();
        this.porcentajeGastos=porcentajeGastos;
    }

    public double getPorcentajeGastos() {
        return porcentajeGastos;
    }

    public void setPorcentajeGastos(double porcentajeGastos) {
        this.porcentajeGastos = porcentajeGastos;
    }

    @Override
    public double getUltimoValorOperado() {
        int suma=0;
        for (InversionGeneral i: inversiones ){
            suma+=i.getUltimoValorOperado();
        }
        return suma-(suma*getPorcentajeGastos()/100);
    }

    @Override
    public ArrayList<InversionGeneral> buscar(Filtro f1) {
        ArrayList<InversionGeneral> resultado = new ArrayList<>();
        if (f1.cumple(this)){
            resultado.add(this);
        }else {
            ArrayList<InversionGeneral> aux = new ArrayList<>();
            for (InversionGeneral i: inversiones){
                aux.addAll(i.buscar(f1));
            }
            return aux;
        }
        return new ArrayList<>();
    }
}
