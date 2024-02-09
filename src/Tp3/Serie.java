package Tp3;


import java.util.Arrays;

public class Serie {

    private Temporada[]  temporada;
    String titulo;

    String descripcion;
    String creador;
    String genero;
    private int cantTempAgregadas;

    public Serie( String titulo, String descripcion, String creador, String genero, int cantidadTemporadas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporada = new Temporada[cantidadTemporadas];
        this.cantTempAgregadas =0;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int episodiosVistosPorSerie(){
        int vistos =0;
        for (Temporada t: temporada){
          vistos+= t.episodiosVistos();
        }
        return vistos;
    }
    public double promedioPorSerie() {
        double promedio = 0;
        int cantidad = 0;
        int suma = 0;
        for (Temporada t: temporada){
           suma+= t.promedioPorTemporada();
           cantidad++;
        }
        if (cantidad != 0) {
            promedio = (double) suma / cantidad;
        }
        return promedio;
    }

    public boolean serieCompletada() {
        int episodiosTotales = 0 ;
        for (Temporada t: temporada){
            episodiosTotales+= t.getCantEpisodios();
        }
        return episodiosTotales == episodiosVistosPorSerie();
    }

    @Override
    public String toString() {
        return "Serie{" +
                ", temporada=" + Arrays.toString(temporada) +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creador='" + creador + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void agregarTemporada(Temporada temporada) {
        if (cantTempAgregadas < this.temporada.length) {
            this.temporada[cantTempAgregadas++] = temporada;
        }
    }
}
