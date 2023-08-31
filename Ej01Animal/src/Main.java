import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Caballo caballo1 = new Caballo("Tiroalblanco", "Heno",3,"Mustang");
        Perro perro1 = new Perro("Dorito", "Pollo", 4, "Criollo");
        Gato gato1 = new Gato("Tequila", "Croquetas", 2, "Esfinge");

        caballo1.alimentarse();
        perro1.alimentarse();
        gato1.alimentarse();
    }
}