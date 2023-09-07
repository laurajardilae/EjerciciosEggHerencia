public class Circulo extends Formas implements calculosFormas{

    private double radio;
    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void calcularArea(){
        area = pifinal * Math.pow(radio, 2);
    }
    public void calcularPerimetro(){
        perimetro = pifinal * radio * 2;
    }
    @Override
    public void diligenciar(){
        calcularArea();
        calcularPerimetro();
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
