package Tp4.ejercicio2;

public class Main {
    public static void main(String[] args) {
        EmpleadoComision em1 = new EmpleadoComision("Jose",3000,1000,15);
        EmpleadoContratados em2 =new EmpleadoContratados("Marcos",3000);
        EmpleadoHorasExtras em3 = new EmpleadoHorasExtras("Antonio",3000,15);

        System.out.println(em3.getNombre() +" gana "+ em3.getSueldo());
        System.out.println( em2.getNombre() +" gana "+ em2.getSueldo());
        System.out.println(em1.getNombre() +" gana "+  em1.getSueldo());


    }
}
