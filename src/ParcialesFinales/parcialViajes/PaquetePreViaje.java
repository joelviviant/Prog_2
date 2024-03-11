package ParcialesFinales.parcialViajes;

import java.time.LocalDate;

public class PaquetePreViaje extends Paquete{
    LocalDate inicio;
    LocalDate fin;
    double descuento;

    public PaquetePreViaje(int id, int cantidadPersonas, String alojamiento, String destino, String origen, double costo, LocalDate inicio, LocalDate fin, double descuento) {
        super(id, cantidadPersonas, alojamiento, destino, origen, costo);
        this.inicio = inicio;
        this.fin = fin;
        this.descuento = descuento;
    }

    public double getCosto(){
        if (this.getFechaDePago()!=null){
            if (this.getFechaDePago().isBefore(inicio)&&this.getFechaDePago().isAfter(fin)){
                    return super.getCosto()*descuento;
            }
        }return super.getCosto();
    }
}
