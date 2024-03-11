package ParcialesFinales.parcialViajes;

import java.util.ArrayList;

public class PaqueteCompuesto extends PaqueteGeneral{
    ArrayList<PaqueteGeneral> paquetes;

    public PaqueteCompuesto(int id, int cantidadPersonas) {
        super(id, cantidadPersonas);
        paquetes = new ArrayList<>();
    }
}
