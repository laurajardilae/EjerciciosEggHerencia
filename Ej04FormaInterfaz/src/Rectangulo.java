public class Rectangulo extends Formas implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void calcularArea(){
        this.area = this.base * this.altura;
    }
    public void calcularPerimetro(){
        this.perimetro = (this.base + this.altura) * 2;
    }
    @Override
    public void diligenciar(){
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
