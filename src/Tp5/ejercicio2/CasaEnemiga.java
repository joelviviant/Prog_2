package Tp5.ejercicio2;

public class CasaEnemiga extends Casa{

    private Casa casaEnemiga;
    public CasaEnemiga(String nombre, int max,Casa casaEnemiga) {
        super(nombre, max);
        this.casaEnemiga = casaEnemiga;
    }

    @Override
    public boolean aceptarAlumno(Alumno alumno) {
        if (!this.casaEnemiga.aceptarAlumno(alumno)){
            return super.aceptarAlumno(alumno);
        }
       return false;
    }
}
