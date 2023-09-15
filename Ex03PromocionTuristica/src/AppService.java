import entidades.*;

import java.util.*;

public class AppService {
    private List<Alojamiento> listado = new ArrayList<>();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void ejecutar(){
        System.out.println("BIENVENIDO");
        datosPorDefecto();
        menu();
    }
    public void datosPorDefecto(){
        Residencia residencia1 = new Residencia( "La punta",  "Calle 4# 2-45",  "Norte",  "Pedro gonzales",  true,  300,  30,  false,  false);
        Residencia residencia2 = new Residencia( "La cueva de morgan",  "Calle 156",  "Norte",  "Marcos Solis",  true,  300,  40,  true,  true);
        Residencia residencia3 = new Residencia( "Punto alto",  "Calle 234",  "Sur",  "Marcela Solis",  true,  300,  10,  true,  true);
        Camping camping1 = new Camping("Las Lomas", "km 5 tierra arriba", "Lomas de pietro", "Camilo pombo", false, 500, 25, 5, true );
        Camping camping2 =new Camping("Los Charcos", "Km 6 via  bremen", "Barbas bremen", "Carlos sifuentes", true, 700, 50, 8, true );
        Camping camping3 =new Camping("Las urracas", "km 8 loras verdes ", "Las Loras", "Andrés bolivar", true, 800, 40, 10, true );
        Camping camping4 =new Camping("Los toboganes de lolo", "km 2 via termales", "termales", "humberto ramirez", true, 1500, 100, 25, true );
        Camping camping5 =new Camping("L gran vista", "km 32 via a rio viejo", "rio viejo", "Angela Carmona", false, 200, 5, 1, false );
        HotelCuatroEstrellas hotelCuatroEstrellas1 = new HotelCuatroEstrellas( "Hilton",  "Calle 72 # 45-12",  "Norte",  "Pedro gonzales",  50,  80,  8,  200,  "A",  "Cumbia",  40);
        HotelCuatroEstrellas hotelCuatroEstrellas2 = new HotelCuatroEstrellas( "GHL",  "Calle 82 # 45-12",  "Norte",  "Pedro castro",  70,  100,  10,  250,  "A",  "Mango",  50);
        HotelCuatroEstrellas hotelCuatroEstrellas3 = new HotelCuatroEstrellas( "Estelar",  "Calle 92 # 45-12", "Norte",  "Pedro martinez",  55,  70,  12,  150,  "A",  "Mayorquin",  30);
        HotelCincoEstrellas hotelCincoEstrellas1 = new HotelCincoEstrellas("la julia", "cra 5 calle 3 No. 5-32", "el tulio", "Javier Gonzaga", 50, 50, 5, 350000, "A", "la ricura", 80, 3, 5, 3);
        HotelCincoEstrellas hotelCincoEstrellas2 = new HotelCincoEstrellas("La Posada del caminante", "cra 66 alle 5 No. 62-36", "el guayabo", "Antonio Lopez", 40, 40, 3, 250000, "A", "el borrego salvaje", 20, 1, 1, 0);
        HotelCincoEstrellas hotelCincoEstrellas3 = new HotelCincoEstrellas("El pedregal", "cra 5 calle 11 No. 11-76", "el boral", "Andrés bustamate", 100, 100, 6, 270000, "A", "Sabores y placeres", 150, 1, 2, 0);


        listado.add(residencia1);
        listado.add(residencia2);
        listado.add(residencia3);
        listado.add(camping1);
        listado.add(camping2);
        listado.add(camping3);
        listado.add(camping4);
        listado.add(camping5);
        listado.add(hotelCuatroEstrellas1);
        listado.add(hotelCuatroEstrellas2);
        listado.add(hotelCuatroEstrellas3);
        listado.add(hotelCincoEstrellas1);
        listado.add(hotelCincoEstrellas2);
        listado.add(hotelCincoEstrellas3);

    }
    public void menu(){
        int opc;
        do {
            System.out.println("Seleccione una opción o presione 9 para salir: ");
            System.out.println("1. Ver todos los alojamientos");
            System.out.println("2. Ver todos los hoteles de más caro a más barato");
            System.out.println("3. Ver todos los campings con restaurante");
            System.out.println("4. Ver todas las residencias que tienen descuento");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    verAlojamientos();
                    break;
                case 2:
                    verHotelesMayoraMenor();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opc!=9);
    }

    public void verAlojamientos(){
        for (Alojamiento alojamiento:listado             ) {
            System.out.println(alojamiento.toString());
        }
    }
    public void verHotelesMayoraMenor(){
        List<Alojamiento> listaSoloHoteles = new ArrayList<>();

        for (Alojamiento a:listado             ) {
            if(a instanceof Hotel){
                listaSoloHoteles.add(a);
            }
        }

        listaSoloHoteles.sort(
                (o1, o2) -> ((Hotel)o2).getPrecioHabitacion().compareTo(((Hotel)o1).getPrecioHabitacion())
        );



    }
}
