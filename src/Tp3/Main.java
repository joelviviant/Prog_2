package Tp3;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
//        Persona persona1 = new Persona(43383638, "joel", "viviant", LocalDate.of(2001, 5, 31));
//        System.out.println(persona1.toString());
//        persona1.setEdad(22);
//        if (persona1.esCoherente()) {
//            System.out.println("es coherente");
//        }
//        persona1.setSexo('m');
//        System.out.println(persona1.toString());


//        Electrodomestico electrodomestico1 = new Electrodomestico("heladera","blanco",80,20000,60);
//        System.out.println(electrodomestico1.toString());
//        if (electrodomestico1.esAltaGama()){
//            System.out.println("es alta gama");
//        }
//        if (electrodomestico1.esBajoConsumo()) {
//            System.out.println("es bajo consumo");
//        }else {
//            System.out.println("es alto consumo");
//        }

            Episodio episodio1 = new Episodio("1", "Conoce los ladrones", true, 3);
            Episodio episodio2 = new Episodio("2", "busca los ladrones", true, 4);
            Episodio episodio3 = new Episodio("3", "roba los ladrones", false, 5);
            Episodio episodio4 = new Episodio("4", "mata los ladrones", true, 7);
            Temporada temporada1 = new Temporada(1, 4);
            Serie serie = new Serie("La Casa de Papel", "Roban un banco", "Joel Viviant", "Accion",1);


            temporada1.agregarEpisodio(episodio1);
            temporada1.agregarEpisodio(episodio2);
            temporada1.agregarEpisodio(episodio3);
            temporada1.agregarEpisodio(episodio4);
            serie.agregarTemporada(temporada1);

            System.out.println(serie.episodiosVistosPorSerie());

    }


}
