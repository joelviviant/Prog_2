package TP5.ejercicio1;

import java.util.EmptyStackException;

public class Pila {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elementos;
    private int capacidad;
    private int tamanio;

    public Pila() {
        this.capacidad = DEFAULT_CAPACITY;
        this.elementos = new int[capacidad];
        this.tamanio = 0;
    }

    // Agregar un elemento a la pila
    public void push(int elemento) {
        if (tamanio == capacidad) {
            aumentarCapacidad();
        }
        elementos[tamanio++] = elemento;
    }

    // Retirar y retornar el último elemento agregado a la pila
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[--tamanio];
    }

    // Consultar el último elemento agregado a la pila sin eliminarlo
    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos[tamanio - 1];
    }

    // Retorna la cantidad de elementos almacenados en la pila
    public int size() {
        return tamanio;
    }

    // Retorna una nueva pila con una copia de los elementos de la pila original
    // en el mismo orden
    public Pila copy() {
        Pila copiaPila = new Pila();
        copiaPila.capacidad = this.capacidad;
        copiaPila.tamanio = this.tamanio;
        copiaPila.elementos = new int[this.capacidad];
        System.arraycopy(this.elementos, 0, copiaPila.elementos, 0, this.tamanio);
        return copiaPila;
    }

    // Retorna una copia de la pila con los elementos en orden inverso
    public Pila reverse() {
        Pila pilaInversa = new Pila();
        for (int i = tamanio - 1; i >= 0; i--) {
            pilaInversa.push(elementos[i]);
        }
        return pilaInversa;
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return tamanio == 0;
    }

    // Aumenta la capacidad de la pila si es necesario
    private void aumentarCapacidad() {
        capacidad *= 2;
        int[] nuevaArray = new int[capacidad];
        System.arraycopy(elementos, 0, nuevaArray, 0, tamanio);
        elementos = nuevaArray;
    }
}
