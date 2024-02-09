package Tp3;

public class PuntoGeometrico {

    private int x;
    private  int y;


    public PuntoGeometrico(){
        x = 0;
        y= 0;
    }

    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplazarPunto(int x, int y){
        this.x += x;
        this.y += y;
    }

    public double calcularDistanciaEuclidiana(PuntoGeometrico segundoPunto) {
        int deltaX = this.x - segundoPunto.getX();
        int deltaY = this.y - segundoPunto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
