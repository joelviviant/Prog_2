package ParcialesFinales.finalBanavest;

import ParcialesFinales.finalBanavest.Estrategias.Criterio;
import ParcialesFinales.finalBanavest.Filtros.Filtro;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class InversionGeneral {
    String nombre;
    ArrayList<Double> valoresDeCierre;


    Criterio rentabilidad;


    public InversionGeneral(String nombre,Criterio  rentabilidad) {
        this.nombre = nombre;
        this.rentabilidad=rentabilidad;
        valoresDeCierre= new ArrayList<>();
    }

    public void setRentabilidad(Criterio rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    public boolean esRentable(){
        return rentabilidad.esRentable(this);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getUltimoValorOperado() ;

    public ArrayList<Double> getValoresDeCierre() {
        return new ArrayList<>(valoresDeCierre);
    }

    public void cerrarDia() {
        valoresDeCierre.addFirst(getUltimoValorOperado());
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
