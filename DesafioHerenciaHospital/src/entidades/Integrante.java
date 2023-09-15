package entidades;

import java.time.LocalDate;

public abstract class Integrante {
    protected Integer orden;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;
    protected String dni;
    protected String sexo;
    protected String vinculo;
    protected Familia familia;
    protected ProblemaSalud problemaSalud;
    protected AbordajeNutricional abordajeNutricional;

    public Integrante() {
    }

    public Integrante(Integer orden, String nombre, LocalDate fechaNacimiento, String sexo, Familia familia) {
        this.orden = orden;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.familia = familia;
    }

    public Integrante(Integer orden, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String sexo, String vinculo, Familia familia, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        this.orden = orden;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.vinculo = vinculo;
        this.familia = familia;
        this.problemaSalud = problemaSalud;
        this.abordajeNutricional = abordajeNutricional;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public ProblemaSalud getProblemaSalud() {
        return problemaSalud;
    }

    public void setProblemaSalud(ProblemaSalud problemaSalud) {
        this.problemaSalud = problemaSalud;
    }

    public AbordajeNutricional getAbordajeNutricional() {
        return abordajeNutricional;
    }

    public void setAbordajeNutricional(AbordajeNutricional abordajeNutricional) {
        this.abordajeNutricional = abordajeNutricional;
    }

    @Override
    public String toString() {
        return "Integrante{" +
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
