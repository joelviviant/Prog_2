package Tp4.ejercicio1;

public class Alarma {
    Sensor sensores [];

    int cantSensores;

    public Alarma(int cantSensores) {
        sensores = new Sensor[cantSensores];
    }


    public void comprobar(){
        for (Sensor s : sensores) {
            if (s.movimientoDetectado){
                activarAlarma(s.getZonaControlada());
            }
        }
    }

    private void activarAlarma(String zonaControlada) {
        System.out.println("¡Alarma activada en "+ zonaControlada);
    }

}