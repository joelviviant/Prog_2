package Tp3;

public class Electrodomestico {
    String nombre;
    double precioBase;
    String color;
    double consumoEnergetico;
    double peso;

    public  Electrodomestico(){
        nombre = "n/n";
        color = "gris plata";
        consumoEnergetico = 10;
        precioBase = 100;
        peso = 2;
    }


    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        color = "gris plata";
        consumoEnergetico = 10;
        precioBase = 100;
        peso = 2;
    }

    public Electrodomestico(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        consumoEnergetico = 10;
        precioBase = 100;
        peso = 2;
    }

    public Electrodomestico(String nombre, String color, double consumoEnergetico) {
        this.nombre = nombre;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        precioBase = 100;
        peso = 2;
    }

    public Electrodomestico(String nombre, String color, double consumoEnergetico, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        peso = 2;
    }

    public Electrodomestico(String nombre, String color, double consumoEnergetico,double precioBase, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        return this.consumoEnergetico<45;
    }

    public double balance(){
        return precioBase/peso;
    }

    public boolean esAltaGama(){
        return balance()>3.0;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
