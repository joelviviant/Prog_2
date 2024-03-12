package ParcialesFinales.finalBanavest;
import ParcialesFinales.finalBanavest.Estrategias.Criterio;

import java.time.LocalDate;

public class InversionEspecial extends InversionSimple{

    String entidadEmisora;
    LocalDate fEmision;
    LocalDate fVencimiento;

    public InversionEspecial(String nombre, int ultimoValorOperado, double variacion, char simbolo, String entidadEmisora, LocalDate fEmision, LocalDate fVencimiento, Criterio criterio) {
        super(nombre, ultimoValorOperado, simbolo,criterio);
        this.entidadEmisora = entidadEmisora;
        this.fEmision = fEmision;
        this.fVencimiento = fVencimiento;
    }

    private boolean enFecha(){
        LocalDate hoy = LocalDate.now();
        return fEmision.compareTo(hoy)<=0 && fVencimiento.compareTo(hoy)>=0;
    }

    @Override
    public void setUltimoValorOperado(int ultimoValorOperado) {
        if (enFecha()){
            super.setUltimoValorOperado(ultimoValorOperado);
        }
    }

    @Override
    public void cerrarDia() {
        if (enFecha()){
            super.cerrarDia();
        }
    }
}
