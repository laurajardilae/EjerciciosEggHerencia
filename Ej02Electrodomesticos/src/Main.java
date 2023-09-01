import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomestico1.crearElectrodomestico();
        electrodomestico1.precioFinal();
        System.out.println(electrodomestico1.toString());*/
        System.out.println("---LAVADORA---");
        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        System.out.println(lavadora1.toString());

        System.out.println("---TELEVISOR---");
        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        System.out.println(televisor1.toString());

    }
}