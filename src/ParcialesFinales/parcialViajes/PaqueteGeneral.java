package ParcialesFinales.parcialViajes;

public abstract class PaqueteGeneral {

    int id;
    private int cantidadPersonas;

    public PaqueteGeneral(int id, int cantidadPersonas) {
        this.id = id;
        this.cantidadPersonas = cantidadPersonas;
    }
}
