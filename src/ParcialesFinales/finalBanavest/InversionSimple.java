package ParcialesFinales.finalBanavest;

import java.util.ArrayList;

public class InversionSimple extends InversionGeneral{
    char simbolo;

    public InversionSimple(String nombre, int ultimoValorOperado, double variacion, char simbolo) {
        super(nombre, ultimoValorOperado, variacion);
        this.simbolo = simbolo;
    }

    @Override
    public int getUltimoValorOperado() {
        return ultimoValorOperado;
    }

    @Override
    public ArrayList<InversionGeneral> buscar(Filtro f1) {
        ArrayList<InversionGeneral> resultado = new ArrayList<>();
        if (f1.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }


}
