package ParcialesFinales.finalZoo;

public class FiltroAltura extends Filtro{

    private double altura;

    public FiltroAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public boolean cumple(Animal animal) {
        return animal.getAltura()>altura;
    }
}
