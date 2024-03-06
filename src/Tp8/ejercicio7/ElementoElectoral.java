package Tp8.ejercicio7;

import java.time.LocalTime;

public abstract class ElementoElectoral {

    public abstract double getVotosPorCandidato(Candidato candidato);

    public  abstract double getVotosFranjaHoraria(LocalTime inicio, LocalTime fin);
    public abstract int votosTotales();

}
