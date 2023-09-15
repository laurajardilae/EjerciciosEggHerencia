package entidades;

import java.time.LocalDate;

public class Adulto extends Integrante{
    protected boolean estudia;
    protected boolean practicaDeporte;
    protected boolean tieneEmpleoFormal;
    protected boolean tieneObraSocial;

    public Adulto() {
    }

    public Adulto(Integer orden, String nombre, LocalDate fechaNacimiento, String sexo, Familia familia) {
        super(orden, nombre, fechaNacimiento, sexo, familia);
    }

    public Adulto(Integer orden, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String sexo, String vinculo, Familia familia, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional, boolean estudia, boolean practicaDeporte, boolean tieneEmpleoFormal, boolean tieneObraSocial) {
        super(orden, nombre, apellido, fechaNacimiento, dni, sexo, vinculo, familia, problemaSalud, abordajeNutricional);
        this.estudia = estudia;
        this.practicaDeporte = practicaDeporte;
        this.tieneEmpleoFormal = tieneEmpleoFormal;
        this.tieneObraSocial = tieneObraSocial;
    }

    public boolean isEstudia() {
        return estudia;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }

    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    public void setPracticaDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isTieneEmpleoFormal() {
        return tieneEmpleoFormal;
    }

    public void setTieneEmpleoFormal(boolean tieneEmpleoFormal) {
        this.tieneEmpleoFormal = tieneEmpleoFormal;
    }

    public boolean isTieneObraSocial() {
        return tieneObraSocial;
    }

    public void setTieneObraSocial(boolean tieneObraSocial) {
        this.tieneObraSocial = tieneObraSocial;
    }

    @Override
    public String toString() {
        return "Adulto{" +
                "estudia=" + estudia +
                ", practicaDeporte=" + practicaDeporte +
                ", tieneEmpleoFormal=" + tieneEmpleoFormal +
                ", tieneObraSocial=" + tieneObraSocial +
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
