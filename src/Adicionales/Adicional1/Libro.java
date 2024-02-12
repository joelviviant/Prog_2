package Adicionales.Adicional1;

public class Libro extends Elemento{
    private int cantPaginas;
    private String resumen;
    private String genero;

    public Libro(String nombre, String autor, double precio,int cantPaginas,String resumen,String genero) {
        super(nombre, autor, precio);
        this.cantPaginas=cantPaginas;
        this.genero=genero;
        this.resumen=resumen;
    }
}
