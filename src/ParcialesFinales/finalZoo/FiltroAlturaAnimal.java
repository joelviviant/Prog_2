package ParcialesFinales.finalZoo;

public class FiltroAlturaAnimal extends Filtro {

    @Override
    public boolean cumple(Animal animal, Jaula jaula) {
        return animal.getAltura() < jaula.getDimension()|| !jaula.isTecho();
    }
}
