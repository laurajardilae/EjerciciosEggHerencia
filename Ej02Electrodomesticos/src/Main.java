import entidad.Electrodomestico;
import entidad.Lavadora;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomestico1.crearElectrodomestico();
        electrodomestico1.precioFinal();
        System.out.println(electrodomestico1.toString());*/

        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        lavadora1.precioFinalLavadora();
        lavadora1.verLavadora();
    }
}