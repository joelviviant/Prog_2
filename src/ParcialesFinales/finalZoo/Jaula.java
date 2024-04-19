package ParcialesFinales.finalZoo;

public class Jaula {

    private double dimension;
    private String seguridad;
    private boolean techo;
    private boolean agua;
    private String cuidador;


    public Jaula(double dimension, String seguridad, boolean techo, boolean agua, String cuidador) {
        this.dimension = dimension;
        this.seguridad = seguridad;
        this.techo = techo;
        this.agua = agua;
        this.cuidador = cuidador;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public String getCuidador() {
        return cuidador;
    }

    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

    public boolean jaulaApta(Animal animal, Filtro f1){
        if (f1.cumple(animal,this)){
            return true;
        }
        return false;
    }
}
