package ParcialesFinales.finalBache;

import java.sql.Timestamp;
import java.util.ArrayList;

public abstract class RegistroGeneral {
    Timestamp incio;
    Timestamp fin;

    public RegistroGeneral(Timestamp incio, Timestamp fin) {
        this.incio = incio;
        this.fin = fin;
    }

    public Timestamp getIncio() {
        return incio;
    }

    public Timestamp getFin() {
        return fin;
    }
    public abstract ArrayList<RegistroGeneral>buscar();
}
