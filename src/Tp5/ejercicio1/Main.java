package Tp5.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva pila de enteros
        Pila pila = new Pila();

        // Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        // Consultar y retirar el último elemento agregado a la pila
        System.out.println("Elemento en el tope de la pila: " + pila.top());

        // Consultar el nuevo tope de la pila
        System.out.println("Nuevo tope de la pila: " + pila.top());

        // Crear una copia de la pila
        Pila copiaPila = pila.copy();
        System.out.println("Copia de la pila:");
        while (!copiaPila.isEmpty()) {
            System.out.println(copiaPila.pop());
        }

        // Crear una pila con los elementos en orden inverso
        Pila pilaInversa = pila.reverse();
        System.out.println("Pila con elementos en orden inverso:");
        while (!pilaInversa.isEmpty()) {
            System.out.println(pilaInversa.pop());
        }
    }
}
