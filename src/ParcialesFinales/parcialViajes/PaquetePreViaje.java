package ParcialesFinales.parcialViajes;

import java.time.LocalDate;

public class PaquetePreViaje extends PaqueteGeneral{
    LocalDate inicio;
    LocalDate fin;
    double descuento;

    public PaquetePreViaje(int id, int cantidadPersonas,LocalDate inicio, LocalDate fin, double descuento) {
        super(id, cantidadPersonas);
        this.inicio=inicio;
        this.fin=fin;
        this.descuento=descuento;
    }


}
