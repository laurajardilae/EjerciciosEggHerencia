package entidades;

public class Barco {
    protected String matricula;
    protected int eslora;
    protected int anioDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioDeFabricacion=" + anioDeFabricacion +
                '}';
    }
    public int calculoModulo(){
        return eslora * 10;
    }

}
