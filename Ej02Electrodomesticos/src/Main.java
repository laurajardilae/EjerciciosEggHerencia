import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("---LAVADORA---");
        Electrodomestico lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        System.out.println(lavadora1.toString());

        System.out.println("---TELEVISOR---");
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        System.out.println(televisor1.toString());*/

        Lavadora lavadora1 = new Lavadora("blanco",'A',40,40);
        Lavadora lavadora2 = new Lavadora("azul",'C',10,10);
        Televisor televisor1 = new Televisor("negro",'F',10,10,false);
        Televisor televisor2 = new Televisor("negro",'B',50,10,true);

        double total = 0;
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        lista.add(lavadora1);
        lista.add(lavadora2);
        lista.add(televisor1);
        lista.add(televisor2);

        for (Electrodomestico elec: lista) {
            System.out.println(elec.toString());
            total+=elec.getPrecio();
        }
        System.out.println("El total es: " + total);


    }
}