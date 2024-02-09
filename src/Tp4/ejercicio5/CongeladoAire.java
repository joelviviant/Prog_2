package Tp4.ejercicio5;

import java.time.LocalDate;

public class CongeladoAire extends ProductoCongelado{
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double vaporAgua;
    public CongeladoAire(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, int codigoAlimentaria, double temperaturaMantenimiento,double nitrogeno,double oxigeno,double dioxidoCarbono, double vaporAgua) {
        super(granjaOrigen, fechaVencimiento, fechaEnvasado, numeroLote, codigoAlimentaria, temperaturaMantenimiento);
        this.nitrogeno=nitrogeno;
        this.oxigeno=oxigeno;
        this.dioxidoCarbono=dioxidoCarbono;
        this.vaporAgua=vaporAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }
}
