package entidades;

public class Motor extends Barco{
    protected int potencia;

    public Motor() {
    }

    public Motor(String matricula, int eslora, int anioDeFabricacion, int potencia) {
        super(matricula, eslora, anioDeFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioDeFabricacion=" + anioDeFabricacion +
                '}';
    }
    @Override
    public int calculoModulo(){
        return super.calculoModulo()+potencia;
    }
}
