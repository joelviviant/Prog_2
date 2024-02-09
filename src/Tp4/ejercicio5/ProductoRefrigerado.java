package Tp4.ejercicio5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private int codigoAlimentaria;
     private double temperaturaMantenimiento;

    public ProductoRefrigerado(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote,int codigoAlimentaria, double temperaturaMantenimiento) {
        super(granjaOrigen, fechaVencimiento, fechaEnvasado, numeroLote);
        this.codigoAlimentaria = codigoAlimentaria;
        this.temperaturaMantenimiento=temperaturaMantenimiento;
    }

    public int getCodigoAlimentaria() {
        return codigoAlimentaria;
    }

    public void setCodigoAlimentaria(int codigoAlimentaria) {
        this.codigoAlimentaria = codigoAlimentaria;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
}
