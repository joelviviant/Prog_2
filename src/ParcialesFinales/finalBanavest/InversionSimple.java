package ParcialesFinales.finalBanavest;

import ParcialesFinales.finalBanavest.Estrategias.Criterio;
import ParcialesFinales.finalBanavest.Filtros.Filtro;

import java.util.ArrayList;

public class InversionSimple extends InversionGeneral{
    char simbolo;
    int  ultimoValorOperado;


    public InversionSimple(String nombre, int ultimoValorOperado, char simbolo,Criterio  rentabilidad ) {
        super(nombre, rentabilidad);
        this.simbolo = simbolo;
        this.ultimoValorOperado= ultimoValorOperado;
    }

    public void setUltimoValorOperado(int ultimoValorOperado) {
        this.ultimoValorOperado = ultimoValorOperado;
    }

    @Override
    public double getUltimoValorOperado() {
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
