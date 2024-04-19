package ParcialesFinales.finalZoo;

public class Animal {

    private double peso;
    private String genero;
    private String tipo_animal;
    private double altura;

    public Animal(double peso, String genero, String tipo_animal, double altura) {
        this.peso = peso;
        this.genero = genero;
        this.tipo_animal = tipo_animal;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
