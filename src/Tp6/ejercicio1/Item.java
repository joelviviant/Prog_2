package Tp6.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Item extends Cliente{
    LocalDate fechaVencimiento;
    LocalDate fechaActual;


    public Item(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        fechaActual= LocalDate.now();
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public abstract boolean alquilarItem(Item e, Cliente c);

    public ArrayList<Cliente> clientesConAlquileresVencidos(Item e, ArrayList<Cliente> clientes) {
        ArrayList<Cliente> clientesVencidos = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ArrayList<Item> itemsAlquilados = cliente.getItemsAlquilados();
            for (Item item : itemsAlquilados) {
                Period periodo = Period.between(fechaActual, item.getFechaVencimiento());
                if (periodo.isNegative()) {
                    clientesVencidos.add(cliente);
                    break; // No es necesario verificar otros ítems alquilados por este cliente
                }
            }
        }
        return clientesVencidos;
    }

}

