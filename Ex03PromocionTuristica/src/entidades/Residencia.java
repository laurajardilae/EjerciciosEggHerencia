package entidades;

public class Residencia extends Extrahotelero{
    private Integer habitaciones;
    private boolean dtoGremios;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, Integer habitaciones, boolean dtoGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.habitaciones = habitaciones;
        this.dtoGremios = dtoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDtoGremios() {
        return dtoGremios;
    }

    public void setDtoGremios(boolean dtoGremios) {
        this.dtoGremios = dtoGremios;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "habitaciones=" + habitaciones +
                ", dtoGremios=" + dtoGremios +
                ", tieneCampoDeportivo=" + tieneCampoDeportivo +
                ", privado=" + privado +
                ", metrosCuadrados=" + metrosCuadrados +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
