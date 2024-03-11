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
}
