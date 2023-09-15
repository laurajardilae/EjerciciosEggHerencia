package entidades;

public class HotelCuatroEstrellas extends Hotel{

    protected String categoriaGimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, double precioHabitacion, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.categoriaGimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return categoriaGimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.categoriaGimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "HotelCuatroEstrellas{" +
                "gimnasio='" + categoriaGimnasio + '\'' +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurante=" + capacidadRestaurante +
                ", cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitacion=" + precioHabitacion +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
    @Override
    public Double calcularPrecio(){
        this.precioHabitacion = super.calcularPrecio() + valorAggRestaurante()+valorAggGimnasio();
        return precioHabitacion;
    }

    public double valorAggRestaurante(){
        if(this.capacidadRestaurante<30){
            return 10;
        } else if (this.capacidadRestaurante>=30&&this.capacidadRestaurante<=50) {
            return 30;
        }else if (this.capacidadRestaurante>50) {
            return 50;
        }
        else {
            return 0;
        }
    }
    public double valorAggGimnasio(){
        if(this.categoriaGimnasio.equalsIgnoreCase("A")){
            return 50;
        } else if (this.categoriaGimnasio.equalsIgnoreCase("B")) {
            return 30;
        } else {
            return 0;
        }
    }


}
