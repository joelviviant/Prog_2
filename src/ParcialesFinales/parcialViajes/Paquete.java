package ParcialesFinales.parcialViajes;

import java.time.LocalDate;

public class Paquete extends PaqueteGeneral{
    private String alojamiento;
    private String destino;
    private String  origen;
    private LocalDate fechaDePago;
    private double costo;

    public Paquete(int id, int cantidadPersonas,String alojamiento,String destino,String origen,double costo) {
        super(id, cantidadPersonas);
        this.alojamiento=alojamiento;
        this.destino=destino;
        this.origen=origen;
        this.costo=costo;
        fechaDePago=null;
    }


}

