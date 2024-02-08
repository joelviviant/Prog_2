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


        Electrodomestico electrodomestico1 = new Electrodomestico("heladera","blanco",80,20000,60);
        System.out.println(electrodomestico1.toString());
        if (electrodomestico1.esAltaGama()){
            System.out.println("es alta gama");
        }
        if (electrodomestico1.esBajoConsumo()) {
            System.out.println("es bajo consumo");
        }else {
            System.out.println("es alto consumo");
        }
    }


}
