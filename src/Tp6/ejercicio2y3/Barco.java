package Tp6.ejercicio2y3;

public class Barco implements ElementoCola{
    private double capacidad;
    private String nombre;
    private Camion camion;

    public Barco(String nombre, double capacidad) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        camion = null;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void Cargar(Camion c){
        this.camion = c;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getCapacidad()>((Barco)otro).getCapacidad();
    }
}
