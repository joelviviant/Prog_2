package ParcialesFinales.parcialViajes;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteCompuesto extends PaqueteGeneral{
    ArrayList<PaqueteGeneral> paquetes;

    public PaqueteCompuesto(int id, int cantidadPersonas) {
        super(id, cantidadPersonas);
        paquetes = new ArrayList<>();
    }

    @Override
    public String getOrigen() {
        if (!paquetes.isEmpty()){
             return paquetes.getFirst().getOrigen();
        }return null;
    }

    @Override
    public String getDestino() {
        int size = paquetes.size()-1;
        if (size>0){
            return paquetes.get(size).getDestino();
        }return  null;
    }

    @Override
    public double getCosto() {
        int suma=0;
        for (PaqueteGeneral p: paquetes){
            suma += p.getCosto();
        }return suma;
    }

    @Override
    public LocalDate getFechaDePago() {
        int paqueteFinal= paquetes.size()-1;
        for (PaqueteGeneral p: paquetes){
            if (p.getFechaDePago() == null){
                return null;
            }
        }return paquetes.get(paqueteFinal).getFechaDePago();
    }

    @Override
    public ArrayList<PaqueteGeneral> buscar(Filtro f1) {
        ArrayList<PaqueteGeneral> result = new ArrayList<>();
        if (f1.cumple(this)){
            result.add(this);
        }else {
            ArrayList<PaqueteGeneral> paquetesCumplidores = new ArrayList<>();
            for (PaqueteGeneral p : paquetes){
                paquetesCumplidores.addAll(p.buscar(f1));
            }
            return paquetesCumplidores;
        }
        return new ArrayList<>();
    }

    public void addPaquete(PaqueteGeneral paquete){
        if (paquete.getCantidadPersonas() == this.getCantidadPersonas()){
            if (paquetes.isEmpty()){
                paquetes.add(paquete);
            } else if (paquetes.getLast().getDestino() == paquete.getOrigen()){
                paquetes.add(paquete);
            }
        }
    }

}
