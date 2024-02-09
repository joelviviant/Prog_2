package Tp3;

public class Temporada {
    Episodio episodio[];
    int numTemporada;
    int cantEpisodios;
    private int cantEpisodiosAgregados;

    public Temporada(int numTemporada, int cantEpisodios) {
        this.numTemporada = numTemporada;
        this.cantEpisodios = cantEpisodios;
        this.episodio = new Episodio[cantEpisodios];
        this.cantEpisodiosAgregados = 0;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getCantEpisodios() {
        return cantEpisodios;
    }

    public void setCantEpisodios(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
    }

    public int episodiosVistos(){
        int vistos =0;
        for (Episodio e:episodio){
            if (e!=null && e.isFlag()){
                vistos++;
            }
        }
        return vistos;
    }

    public double promedioPorTemporada() {
        double promedio = 0;
        int cantidad = 0;
        int suma = 0;
        for (Episodio e : episodio) {
            if (e != null && e.isFlag() && e.getCalificacion() != 0) {
                suma += e.getCalificacion();
                cantidad++;
            }
        }
        if (cantidad != 0) {
            promedio = (double) suma / cantidad;
        }
        return promedio;
    }

    public void agregarEpisodio(Episodio episodio){
        if (cantEpisodiosAgregados<cantEpisodios) {
            this.episodio[cantEpisodiosAgregados] = episodio;
            cantEpisodiosAgregados++;
        }
    }
}
