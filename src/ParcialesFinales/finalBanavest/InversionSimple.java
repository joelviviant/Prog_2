package ParcialesFinales.finalBanavest;

public class InversionSimple extends InversionGeneral{
    char simbolo;

    public InversionSimple(String nombre, int ultimoValorOperado, double variacion, char simbolo) {
        super(nombre, ultimoValorOperado, variacion);
        this.simbolo = simbolo;
    }

    @Override
    public int getUltimoValorOperado() {
        return ultimoValorOperado;
    }


}
