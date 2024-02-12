package Adicionales.Adicional1;

public class Revista extends Elemento{
    private int numero;
    private int anio;

    public Revista(String nombre, String autor, double precio,int numero, int anio) {
        super(nombre, autor, precio);
        this.anio=anio;
        this.numero=numero;
    }
}
