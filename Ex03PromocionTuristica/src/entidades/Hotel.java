package entidades;

public abstract class Hotel extends Alojamiento{
    protected Integer cantHabitaciones;
    protected Integer numCamas;
    protected Integer cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, double precioHabitacion) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitacion=" + precioHabitacion +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public Double calcularPrecio(){
        this.precioHabitacion = 50 + (1.0 * this.cantHabitaciones);
        return precioHabitacion;
    }
}
