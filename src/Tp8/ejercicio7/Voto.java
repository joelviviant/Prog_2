package Tp8.ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voto {
    Candidato candidatoVotado;
    LocalTime hora;

    public Voto(Candidato candidatoVotado) {
        this.candidatoVotado = candidatoVotado;
        this.hora = LocalTime.now();
    }

    public Candidato getCandidatoVotado() {
        return candidatoVotado;
    }

    public LocalTime getHora() {
        return hora;
    }
}
