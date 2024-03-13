package ParcialesFinales.finalBache;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;

public class RegistroCompuesto extends RegistroGeneral{

    private ArrayList<RegistroGeneral> registros;

    public RegistroCompuesto(Timestamp incio, Timestamp fin, ArrayList<RegistroGeneral> registros) {
        super(incio, fin);
        this.registros = registros;
    }

    public ArrayList<RegistroGeneral> getRegistros() {
        return new ArrayList<>(registros);
    }

    private boolean enTiempo(Timestamp t){
        return getIncio().compareTo(t) <=0 && getFin().compareTo(t)>=0;
    }

    public void addRegistro(RegistroGeneral r){
        if (enTiempo(r.getIncio())&& enTiempo(r.getFin())){
            registros.add(r);
        }
    }


    @Override
    public ArrayList<RegistroGeneral> buscar() {
        ArrayList<RegistroGeneral> cumplidor = new ArrayList<>();
        for (RegistroGeneral r:registros){

        }
        return cumplidor;
    }
}
