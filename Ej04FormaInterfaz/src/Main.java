// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        circulo.diligenciar();
        System.out.println(circulo.toString());

        Rectangulo rectangulo = new Rectangulo(18,12);
        rectangulo.diligenciar();
        System.out.println(rectangulo.toString());
    }
}