package Tp4.ejercicio2;

public class EmpleadoHorasExtras extends Empleado{

    final int precioHora;
    int horasExtras;
    public EmpleadoHorasExtras(String nombre, int sueldo,int horasExtras) {
        super(nombre, sueldo);
        precioHora = 100;
        this.horasExtras = horasExtras;
    }



    @Override
    public double getSueldo() {
        int extra = precioHora*horasExtras;
        return super.getSueldo()+extra;
    }
}
