package entidades;

public class Yate extends Motor{
    private int camarotes;

    public Yate() {
    }


    public Yate(String matricula, int eslora, int anioDeFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anioDeFabricacion, potencia);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "camarotes=" + camarotes +
                ", potencia=" + potencia +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioDeFabricacion=" + anioDeFabricacion +
                '}';
    }
    @Override
    public int calculoModulo(){
        return super.calculoModulo()+camarotes;
    }
}
