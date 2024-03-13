package ParcialesFinales.finalMarcadores;

import ParcialesFinales.finalMarcadores.Filtro.Filtro;

import java.util.ArrayList;

public class Marcador extends ElementoMarcador {

    String titulo;
    String url;
    ArrayList<String> palabrasClaves;
    String usuario;

    public Marcador(String titulo, String url, String usuario, ArrayList<String> palabrasClaves) {
        this.titulo = titulo;
        this.url = url;
        this.usuario = usuario;
        this.palabrasClaves = new ArrayList<>(palabrasClaves);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrl() {
        return url;
    }



    public String getUsuario() {
        return usuario;
    }

    public ElementoMarcador copia(Filtro f1) {
        if (f1.cumple(this)) {
            Marcador copia = new Marcador(this.getTitulo(), this.getUrl(), this.getUsuario(),this.getPalabrasClave());
            return copia;
        }
        return null;
    }

    @Override
    public ArrayList<Marcador> buscar(Filtro f1) {
        ArrayList<Marcador> resultado= new ArrayList<>();
        if (f1.cumple(this)){
            resultado.add(this);
        }return resultado;
    }


    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClaves);
    }

    @Override
    public int contarMarcadores() {
        return 1;
    }
}