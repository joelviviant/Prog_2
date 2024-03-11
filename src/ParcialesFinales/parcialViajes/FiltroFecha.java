package ParcialesFinales.parcialViajes;

import java.time.LocalDate;

public class FiltroFecha extends Filtro{

    LocalDate fecha;

    public FiltroFecha(LocalDate fecha){
        this.fecha=fecha;
    }


    @Override
    public boolean cumple(PaqueteGeneral p) {
        return p.getFechaDePago().isEqual(fecha);
    }
}
