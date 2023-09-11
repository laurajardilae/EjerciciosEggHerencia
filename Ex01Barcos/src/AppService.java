import entidades.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppService {
    private List<Barco> listadoBarcos = new ArrayList<>();
    private List<Alquiler> listadoAlquileres = new ArrayList<>();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void ejecutar(){
        System.out.println("BIENVENIDO");
        datosPorDefecto();
        menu();
    }
    public void datosPorDefecto(){
        Barco barco1 = new Barco("1234",10,2000);
        Velero velero1 = new Velero("4567",5,2000,2);
        Motor motor1 = new Motor("7891", 7,2000,100);
        Yate yate1 = new Yate("2345",10,2000,100,10);
        listadoBarcos.add(barco1);
        listadoBarcos.add(velero1);
        listadoBarcos.add(motor1);
        listadoBarcos.add(yate1);
    }
    public void menu(){
        int opc;
        do {
            System.out.println("Seleccione una opción o presione 9 para salir");
            System.out.println("1. Crear nuevo alquiler");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    crearAlquiler();

                case 9:
                    System.out.println("Hasta luego");
            }
        }while (opc!=9);


    }
    public void mostrarBarcosDisponibles(){
        for (int i = 0; i < listadoBarcos.size(); i++) {
            System.out.println(i + " " + listadoBarcos.get(i).toString());
        }
    }
    public void crearAlquiler(){
        Alquiler alquiler = new Alquiler();
        System.out.println("Ingrese su nombre:");
        alquiler.setNombre(scan.next());
        System.out.println("Seleccione el barco:");
        mostrarBarcosDisponibles();
        alquiler.setBarco(listadoBarcos.get(Integer.parseInt(scan.next())));
        System.out.println("Ingrese fecha de inicio de alquiler:");
        alquiler.setFechaAlquiler(LocalDate.parse(scan.next(),formato));
        System.out.println("Ingrese fecha de devolución:");
        alquiler.setFechaDevolucion(LocalDate.parse(scan.next(),formato));
        System.out.println("El valor de su alquiler es: " + alquiler.calculoAlquiler());
        listadoAlquileres.add(alquiler);
    }

}
