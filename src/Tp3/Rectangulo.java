package Tp3;

public class Rectangulo {
    private PuntoGeometrico punto1;
    private PuntoGeometrico punto2;
    private double base;
    private double altura;

    public Rectangulo(PuntoGeometrico punto1, PuntoGeometrico punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.base = Math.abs(punto2.getX() - punto1.getX());
        this.altura = Math.abs(punto2.getY() - punto1.getY());
        if (this.base == 0 || this.altura == 0) {
            System.out.println("Los lados del rectángulo no están paralelos a los ejes.");
        }
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void desplazarRectangulo(int x, int y){
        this.punto1.desplazarPunto(x,y);
        this.punto2.desplazarPunto(x,y);
    }

    public double calcularArea(){
        return  base*altura;
    }

    public int compararCon(Rectangulo segundoRectangulo) {
        double area1 = this.calcularArea();
        double area2 = segundoRectangulo.calcularArea();

        if (area1 > area2) {
            return 1;
        } else if (area1 < area2) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean esCuadrado() {
        return base == altura;
    }

    public double obtenerLadoSuperior() {
        if (altura > base) {
            return altura;
        } else {
            return base;
        }
    }
    public String determinarOrientacion() {
        if (altura > base) {
            return "Parado";
        } else {
            return "Acostado";
        }
    }
}

