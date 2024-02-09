package Tp4;

public class Alarma {
    Sensor sensores [];
    boolean vidrioRoto;
    boolean puertaVentanaAbierta;
    boolean movimientoDetectado;
    int cantSensores;

    public Alarma(int cantSensores) {
        vidrioRoto = false;
        puertaVentanaAbierta = false;
        movimientoDetectado = false;
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