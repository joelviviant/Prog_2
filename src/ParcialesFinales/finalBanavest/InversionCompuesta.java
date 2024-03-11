package ParcialesFinales.finalBanavest;

import java.util.ArrayList;

public class InversionCompuesta extends InversionGeneral{
    ArrayList<InversionGeneral> inversiones;
    public InversionCompuesta(String nombre, int ultimoValorOperado, double variacion) {
        super(nombre, ultimoValorOperado, variacion);
        inversiones = new ArrayList<>();
    }

    @Override
    public int getUltimoValorOperado() {
        int suma=0;
        for (InversionGeneral i: inversiones ){
            suma+=i.getUltimoValorOperado();
        }
        return suma-(suma*5/100);
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
