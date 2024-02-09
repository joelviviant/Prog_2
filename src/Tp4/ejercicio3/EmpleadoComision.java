package Tp4.ejercicio3;

public class EmpleadoComision extends Empleado{

    double valorVentas;
    double porcentaje;
    public EmpleadoComision(String nombre, int sueldo, double valorVentas, double porcentaje ) {
        super(nombre, sueldo);
        this.valorVentas=valorVentas;
        this.porcentaje=porcentaje;
    }

    @Override
    public double getSueldo() {
        double comision = valorVentas * (porcentaje / 100.0);
        return super.getSueldo() + comision;
    }
}
