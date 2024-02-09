package Tp4.ejercicio1;

public class SensorMovimiento extends Sensor{

    public SensorMovimiento(String zonaControlada) {
        super(zonaControlada);
    }

    @Override
    public boolean sensorActivado() {
        activarSensor();
        return super.sensorActivado();
    }
}
