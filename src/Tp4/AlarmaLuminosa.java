package Tp4;

public class AlarmaLuminosa extends Alarma{
    Luz luz;
    Timbre timbre;


    public AlarmaLuminosa(int cantSensores) {
        super(cantSensores);
        luz = new Luz();
        timbre= new Timbre();
    }
}
