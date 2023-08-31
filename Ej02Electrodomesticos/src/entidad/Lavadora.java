package entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private int carga;
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora: ");
        carga = Integer.parseInt(scan.next());
    }
    public void precioFinalLavadora(){
        precioFinal();
        if(carga>30){
            setPrecio(getPrecio()+500);
        }
    }
    public void verLavadora(){
        System.out.println("Lavadora: Carga: "+carga+" - Precio: "+getPrecio());
    }
    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
