package Tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    LocalDate fechaNacimiento;
    int DNI;
    char sexo;
    double peso;
    double altura;

    public Persona(int DNI) {
        this.DNI = DNI;
        edad = 0;
        fechaNacimiento = LocalDate.of(2000,01,1);
        sexo ='f';
        nombre= "n";
        apellido = "n";
        peso= 1;
        altura=1;
    }

    public Persona(int DNI, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        edad = 0;
        fechaNacimiento = LocalDate.of(2000,01,1);
        sexo ='f';
        peso= 1;
        altura=1;
    }

    public Persona(int DNI, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        edad = 0;
        sexo ='f';
        peso= 1;
        altura=1;
    }

    public double masaCorporal(){
        return (peso/Math.pow(altura,2));
    }

    public boolean estaEnForma(){
        return masaCorporal()>=18.5 && masaCorporal()<=25;
    }

    public boolean esCumpleanios(){
        LocalDate hoy = LocalDate.now();
        return hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth()
                && hoy.getMonthValue() == fechaNacimiento.getMonthValue();
    }

    public boolean esMayor(){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears()>=18;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean puedeVotar(){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears()>=16;
    }

    public boolean esCoherente(){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        int edad = periodo.getYears();
        return this.edad == edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}


