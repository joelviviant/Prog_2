package clase20210928.personas;

import clase20210928.ej2tp6.ColaEspera;

public class Facultad {
    ColaEspera alumnos;

    public Facultad() {
        alumnos = new ColaEspera();
    }

    public void addAlumno(Alumno alumno){
        alumnos.addElemento(alumno);
    }
}
