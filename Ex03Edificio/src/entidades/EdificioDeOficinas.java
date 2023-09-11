package entidades;

public class EdificioDeOficinas extends Edificio{
    private int pisos;
    private int personasPorPiso;
    private int cantPersonas;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int pisos, int personasPorPiso) {
        super(ancho, alto, largo);
        this.pisos = pisos;
        this.personasPorPiso = personasPorPiso;
        this.cantPersonas = pisos*personasPorPiso;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPersonasPorPiso() {
        return personasPorPiso;
    }

    public void setPersonasPorPiso(int personasPorPiso) {
        this.personasPorPiso = personasPorPiso;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" +
                "pisos=" + pisos +
                ", personasPorPiso=" + personasPorPiso +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
    @Override
    public double calcularSuperficie() {
        return ancho*largo;
    }
    public double calcularVolumen(){
        return ancho*largo*alto;
    }
}
