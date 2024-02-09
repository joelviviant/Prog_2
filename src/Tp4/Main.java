package Tp4;
public class Main{
    public  static void main(String[] args) {

        SensorMovimiento sensor1 = new SensorMovimiento("cocina");
        SensorPuertaVentana sensor2 = new SensorPuertaVentana("habitacion");
        SensorVidrio sensor3 = new SensorVidrio("living");

        Alarma alarma1 = new Alarma(3);
        alarma1.sensores[0] = sensor1;
        alarma1.sensores[1] = sensor2;
        alarma1.sensores[2] = sensor3;

        sensor2.sensorActivado();
        alarma1.comprobar();

    }

}
