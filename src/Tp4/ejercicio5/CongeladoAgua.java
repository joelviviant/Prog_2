package Tp4.ejercicio5;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado{
    int gramosSal;
    int litrosAgua;
    public CongeladoAgua(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, int codigoAlimentaria, double temperaturaMantenimiento,int gramosSal, int litrosAgua) {
        super(granjaOrigen, fechaVencimiento, fechaEnvasado, numeroLote, codigoAlimentaria, temperaturaMantenimiento);
        this.gramosSal=gramosSal;
        this.litrosAgua=litrosAgua;
    }

    public int salinidad(){
        return gramosSal*litrosAgua;
    }

    public int getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(int gramosSal) {
        this.gramosSal = gramosSal;
    }

    public int getLitrosAgua() {
        return litrosAgua;
    }

    public void setLitrosAgua(int litrosAgua) {
        this.litrosAgua = litrosAgua;
    }
}
