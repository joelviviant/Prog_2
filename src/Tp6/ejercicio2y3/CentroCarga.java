package Tp6.ejercicio2y3;

public class CentroCarga {
    private ColaEspera barcos;
    private ColaEspera camiones;

    public CentroCarga() {
        this.barcos = new ColaEspera();
        this.camiones = new ColaEspera();
    }
    public void addBarco(Barco barco){
        if (barco==null) return;
        if (camiones.tieneElementos()){
            Camion camion = (Camion) camiones.getSiguiente();
            barco.Cargar(camion);
        }
        else barcos.addElemento(barco);
    }

    public void addCamion(Camion camion){
        if (camion==null) return;
        if (barcos.tieneElementos()){
            Barco libre = (Barco) barcos.getSiguiente();
            libre.Cargar(camion);
        }
        else {
            camiones.addElemento(camion);
        }
    }

}
