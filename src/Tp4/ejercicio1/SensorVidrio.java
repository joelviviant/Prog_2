package Tp4.ejercicio1;

public class SensorVidrio extends Sensor{
    public SensorVidrio(String zonaControlada) {
        super(zonaControlada);
    }

    @Override
    public boolean sensorActivado() {
        activarSensor();
        return super.sensorActivado();
    }
}
