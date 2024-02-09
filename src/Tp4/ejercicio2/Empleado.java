package Tp4.ejercicio2;

public class Empleado {
    String nombre;
    int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }
}
