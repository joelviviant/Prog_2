package Tp3;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Persona persona1 = new Persona(43383638, "joel", "viviant", LocalDate.of(2001, 5, 31));
        System.out.println(persona1.toString());
        persona1.setEdad(22);
        if (persona1.esCoherente()) {
            System.out.println("es coherente");
        }
        persona1.setSexo('m');
        System.out.println(persona1.toString());

    }


}
