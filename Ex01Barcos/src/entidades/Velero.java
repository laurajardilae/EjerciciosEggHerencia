package entidades;

public class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    public Velero(String matricula, int eslora, int anioDeFabricacion, int mastiles) {
        super(matricula, eslora, anioDeFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "mastiles=" + mastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioDeFabricacion=" + anioDeFabricacion +
                '}';
    }
    @Override
    public int calculoModulo(){
        return super.calculoModulo()+mastiles;
    }
}
