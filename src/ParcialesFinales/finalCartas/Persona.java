package ParcialesFinales.finalCartas;

import java.util.Objects;

public class Persona {
    int dni;
    Direccion direccion;


    public Persona(int dni, Direccion direccion) {
        this.dni = dni;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


}
