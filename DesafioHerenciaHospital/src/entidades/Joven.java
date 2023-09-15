package entidades;

import java.time.LocalDate;

public class Joven extends Integrante{
    protected String estudios;
    protected boolean practicaDeporte;
    protected boolean trabaja;

    public Joven() {
    }

    public Joven(Integer orden, String nombre, LocalDate fechaNacimiento, String sexo, Familia familia) {
        super(orden, nombre, fechaNacimiento, sexo, familia);
    }

    public Joven(Integer orden, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String sexo, String vinculo, Familia familia, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional, String estudios, boolean practicaDeporte, boolean trabaja) {
        super(orden, nombre, apellido, fechaNacimiento, dni, sexo, vinculo, familia, problemaSalud, abordajeNutricional);
        this.estudios = estudios;
        this.practicaDeporte = practicaDeporte;
        this.trabaja = trabaja;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    public void setPracticaDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public String toString() {
        return "Joven{" +
                "estudios='" + estudios + '\'' +
                ", practicaDeporte=" + practicaDeporte +
                ", trabaja=" + trabaja +
                ", orden=" + orden +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", vinculo='" + vinculo + '\'' +
                ", familia=" + familia +
                ", problemaSalud=" + problemaSalud +
                ", abordajeNutricional=" + abordajeNutricional +
                '}';
    }
}
