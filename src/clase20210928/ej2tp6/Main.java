package clase20210928.ej2tp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        CentroComputo centro = new CentroComputo();

        Computadora compu1 = new Computadora("lab1", 2560.0);
        Computadora compu2 = new Computadora("lab2", 5560.0);
        Computadora compu3 = new Computadora("lab3", 3560.0);

        centro.addComputadora(compu1);
        centro.addComputadora(compu2);
        centro.addComputadora(compu3);



    }
}
