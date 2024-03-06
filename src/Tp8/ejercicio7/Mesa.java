package Tp8.ejercicio7;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class Mesa extends ElementoElectoral{
    ArrayList<Votante> padron;
    int numeroMesa;
    ArrayList<Voto>  votos;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        padron = new ArrayList<>();
        votos = new ArrayList<>();
    }

    public void votar(Votante v, Voto  voto){
        if (padron.contains(v.getDNI())){
            votos.add(voto);
        }
        else {
            System.out.println("no pertenece a la mesa");
        }
    }

    @Override
    public double getVotosPorCandidato(Candidato candidato) {
        int totalVotos=0;
        for (Voto v : votos){
            if (v.candidatoVotado.equals(candidato)){
                totalVotos ++;
            }
        }
         return totalVotos/votos.size()*100;
    }

    @Override
    public double getVotosFranjaHoraria(LocalTime inicio, LocalTime fin) {
        int totalVotos=0;
        for (Voto v : votos){
            if (v.getHora().compareTo(inicio)>=0 && v.getHora().compareTo(fin)<=0){
                totalVotos ++;
            }
        }
        return totalVotos/votos.size()*100;
    }

    @Override
    public int votosTotales() {
        return votos.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return numeroMesa == mesa.numeroMesa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroMesa);
    }


}
