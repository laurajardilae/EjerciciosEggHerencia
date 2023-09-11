import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edificio> lista = new ArrayList<>();
        lista.add(new Polideportivo(15,5,28,"Lagos",false));
        lista.add(new EdificioDeOficinas(10,15,10,3,5));
        lista.add(new Polideportivo(15,5,28,"Mediteranea",true));
        lista.add(new EdificioDeOficinas(25,15,10,5,10));

        for (Edificio e:lista             ) {
            System.out.println(e + "\nSuperficie: " + e.calcularSuperficie() + "\nVolumen " + e.calcularVolumen());
            System.out.println("---------------");
        }

    }
}