package Tp8.ejercicio7;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class Grupo extends ElementoElectoral{

        ArrayList<ElementoElectoral> elementoElectorales;
        int ID;

    public Grupo(int ID) {
        this.ID = ID;
        elementoElectorales = new ArrayList<>();
    }

    @Override
    public double getVotosPorCandidato(Candidato candidato) {
        int totalVotos = 0;
        for (ElementoElectoral e : elementoElectorales) {
            totalVotos += e.getVotosPorCandidato(candidato);
        }
        return totalVotos/elementoElectorales.size()*100;
    }

    @Override
    public double getVotosFranjaHoraria(LocalTime inicio, LocalTime fin) {
        int totalVotos = 0;
        for (ElementoElectoral e : elementoElectorales) {
            totalVotos += e.getVotosFranjaHoraria(inicio, fin);
        }
        return totalVotos/elementoElectorales.size()*100;
    }

    @Override
    public int votosTotales() {
        int totalVotos = 0;
        for (ElementoElectoral e : elementoElectorales) {
            totalVotos += e.votosTotales();
        }
        return totalVotos;
    }

    public void addElemento(ElementoElectoral elemento){
        if (!elementoElectorales.contains(elemento)){
            elementoElectorales.add(elemento);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return ID == grupo.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
