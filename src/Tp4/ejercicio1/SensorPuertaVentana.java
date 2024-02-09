package Tp4.ejercicio1;

public class SensorPuertaVentana extends Sensor{
    public SensorPuertaVentana(String zonaControlada) {
        super(zonaControlada);
    }

    @Override
    public boolean sensorActivado() {
        activarSensor();
        return super.sensorActivado();
    }
}
