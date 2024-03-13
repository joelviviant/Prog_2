package ParcialesFinales.finalBache;

import java.sql.Timestamp;
import java.util.ArrayList;

public class RegistroSimple extends RegistroGeneral{
    Criterio esBache;
    private double x,y,z;

    public RegistroSimple(Timestamp incio, Timestamp fin, Criterio esBache, double x, double y, double z) {
        super(incio, fin);
        this.esBache = esBache;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean representaBache(){
        return  esBache.representaBache(this);
    }

    public void setEsBache(Criterio esBache) {
        this.esBache = esBache;
    }


    @Override
    public ArrayList<RegistroGeneral> buscar() {
      ArrayList<RegistroGeneral> cumplidor = new ArrayList<>();
      if (this.representaBache()){
          cumplidor.add(this);
      }return cumplidor;
    }
}
