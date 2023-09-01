package entidad;

import enumeraciones.ConsumoEnergetico;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected double peso;
    protected Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(Character letra){
        letra = Character.toTitleCase(letra);
        if(letra!='A' && letra!='B' && letra!='C' && letra !='D' && letra!='E'){
            return 'F';
        }else{
            return letra;
        }
    }
    public String comprobarColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco")||color.equals("negro")||color.equals("azul")||color.equals("rojo")||color.equals("gris")){
            return color;
        }else{
            return "blanco";
        }
    }
    public void crearElectrodomestico(){
        precio = 1000;
        System.out.println("Ingrese el color del electrodoméstico: ");
        color = comprobarColor(scan.next());
        System.out.println("Ingrese el consumo energético del electrodoméstico: ");
        consumoEnergetico = comprobarConsumoEnergetico(scan.next().charAt(0));
        System.out.println("Ingrese el peso del electrodoméstico: ");
        peso = Double.parseDouble(scan.next());
    }
    public void precioFinal(){
        if(peso>=1&&peso<=19){
            precio+=100;
        } else if (peso>=20&&peso<=49) {
            precio+=500;
        }else if (peso>=50&&peso<=79) {
            precio+=800;
        }else if (peso>=80) {
            precio+=1000;
        }

        if(consumoEnergetico.equals('A')){
            precio+=1000;
        } else if (consumoEnergetico.equals('B')) {
            precio+=800;
        }else if (consumoEnergetico.equals('C')) {
            precio+=600;
        }else if (consumoEnergetico.equals('D')) {
            precio+=500;
        }else if (consumoEnergetico.equals('E')) {
            precio+=300;
        }else if (consumoEnergetico.equals('F')) {
            precio+=100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
