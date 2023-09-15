package entidades;

import java.time.LocalDate;

public class AdultoMayor extends Integrante{
    protected boolean tieneJubilacion;

    public AdultoMayor() {
    }

    public AdultoMayor(Integer orden, String nombre, LocalDate fechaNacimiento, String sexo, Familia familia) {
        super(orden, nombre, fechaNacimiento, sexo, familia);
    }

    public AdultoMayor(Integer orden, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String sexo, String vinculo, Familia familia, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional, boolean tieneJubilacion) {
        super(orden, nombre, apellido, fechaNacimiento, dni, sexo, vinculo, familia, problemaSalud, abordajeNutricional);
        this.tieneJubilacion = tieneJubilacion;
    }

    public boolean isTieneJubilacion() {
        return tieneJubilacion;
    }

    public void setTieneJubilacion(boolean tieneJubilacion) {
        this.tieneJubilacion = tieneJubilacion;
    }

    @Override
    public String toString() {
        return "AdultoMayor{" +
                "tieneJubilacion=" + tieneJubilacion +
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
