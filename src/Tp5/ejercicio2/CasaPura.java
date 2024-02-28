package Tp5.ejercicio2;

public class CasaPura extends Casa{
    public CasaPura(String nombre, int max) {
        super(nombre, max);
    }

    @Override
    public boolean aceptarAlumno(Alumno alumno) {
        for(Alumno a : this.getAlumnos()){
            if (alumno.contieneFamiliar(a)){
                return super.aceptarAlumno(alumno);
            }
        }
        return false;
    }
}
