package Tp4;

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
