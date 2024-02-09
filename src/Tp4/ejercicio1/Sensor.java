package Tp4.ejercicio1;

public class Sensor {
    String zonaControlada;
    boolean movimientoDetectado;


    public Sensor(String zonaControlada) {
        this.zonaControlada = zonaControlada;
        movimientoDetectado = false;
    }

    public String getZonaControlada() {
        return zonaControlada;
    }
    public void activarSensor() {
        movimientoDetectado = true;
    }

    public boolean sensorActivado() {
        return movimientoDetectado;
    }
}
