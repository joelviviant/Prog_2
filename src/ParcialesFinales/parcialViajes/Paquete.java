package ParcialesFinales.parcialViajes;

import java.time.LocalDate;
import java.util.ArrayList;

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

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    @Override
    public String getOrigen() {
        return  origen;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    @Override
    public ArrayList<PaqueteGeneral> buscar(Filtro f1) {
         ArrayList<PaqueteGeneral> result = new ArrayList<>();
         if (f1.cumple(this)){
             result.add(this);
         }
         return result;
    }
}

