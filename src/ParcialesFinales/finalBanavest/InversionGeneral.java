package ParcialesFinales.finalBanavest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class InversionGeneral {
    String nombre;
    int ultimoValorOperado;
    ArrayList<Integer> valoresDeCierre;
    double variacion;

    public InversionGeneral(String nombre, int ultimoValorOperado, double variacion) {
        this.nombre = nombre;
        this.ultimoValorOperado = ultimoValorOperado;
        this.variacion = variacion;
        valoresDeCierre= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getUltimoValorOperado() ;

    public ArrayList<Integer> getValoresDeCierre() {
        return valoresDeCierre;
    }

    public void addValorDeCierre(int ultimoValorOperado) {
        valoresDeCierre.addFirst(ultimoValorOperado);
    }

    public double getVariacion() {
        double ultimoValorOperado = getUltimoValorOperado();
        double ultimoValorDeCierre = valoresDeCierre.getLast();
        return ultimoValorOperado-ultimoValorDeCierre/ultimoValorDeCierre;
    }

    public abstract ArrayList<InversionGeneral> buscar(Filtro f1);

    public ArrayList<InversionGeneral> buscar(Filtro f1, Comparator<InversionGeneral> c1){
        ArrayList<InversionGeneral> resultado = new ArrayList<>();
        Collections.sort(resultado,c1);
        return resultado;
    }


}
