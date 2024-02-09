package Tp4.ejercicio5;

import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado{
    private int cantNitrogeno;
    private int tiempo;
    public CongeladoNitrogeno(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote, int codigoAlimentaria, double temperaturaMantenimiento,int cantNitrogeno,int tiempo) {
        super(granjaOrigen, fechaVencimiento, fechaEnvasado, numeroLote, codigoAlimentaria, temperaturaMantenimiento);
        this.cantNitrogeno=cantNitrogeno;
        this.tiempo=tiempo;
    }

    public int getCantNitrogeno() {
        return cantNitrogeno;
    }

    public void setCantNitrogeno(int cantNitrogeno) {
        this.cantNitrogeno = cantNitrogeno;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
