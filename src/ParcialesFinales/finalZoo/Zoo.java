package ParcialesFinales.finalZoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animales;
    private ArrayList<Jaula> jaulas;


    public Zoo() {
        animales = new ArrayList<>();
        jaulas = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimales() {
        return new ArrayList<>(animales);
    }
    public ArrayList<Jaula> getJaulas() {
        return new ArrayList<>(jaulas);
    }

    public void addAnimal(Animal animal) {
        if (!animales.contains(animal)) {
            animales.add(animal);
        }
    }

    public void addJaula(Jaula jaula) {
        if (!jaulas.contains(jaula)) {
            jaulas.add(jaula);
        }
    }


}
