package Tp4.ejercicio5;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    public ProductoFresco(String granjaOrigen, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int numeroLote) {
        super(granjaOrigen, fechaVencimiento, fechaEnvasado, numeroLote);
    }

}
