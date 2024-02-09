package Tp4.ejercicio1;

public class AlarmaLuminosa extends Alarma{
    Luz luz;
    Timbre timbre;


    public AlarmaLuminosa(int cantSensores) {
        super(cantSensores);
        luz = new Luz();
        timbre= new Timbre();
    }
}
