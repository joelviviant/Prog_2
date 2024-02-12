package Adicionales.Adicional1;

public class ClienteExigente extends Cliente{

    @Override
    public boolean leGusta(Elemento elemento) {
        return getGenerosFav().contains(elemento) && super.leGusta(elemento);
    }
}
