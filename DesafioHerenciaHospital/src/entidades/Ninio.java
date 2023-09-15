package entidades;

import java.time.LocalDate;

public class Ninio extends Integrante{
    public Ninio() {
    }

    public Ninio(Integer orden, String nombre, LocalDate fechaNacimiento, String sexo, Familia familia) {
        super(orden, nombre, fechaNacimiento, sexo, familia);
    }

    public Ninio(Integer orden, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String sexo, String vinculo, Familia familia, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        super(orden, nombre, apellido, fechaNacimiento, dni, sexo, vinculo, familia, problemaSalud, abordajeNutricional);
    }


    @Override
    public String toString() {
        return "Ninio{" +
                "orden=" + orden +
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
