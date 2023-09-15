package entidades;

public class HotelCincoEstrellas extends HotelCuatroEstrellas{
    private Integer cantSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, double precioHabitacion, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitacion, gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "HotelCincoEstrellas{" +
                "cantSalonesConf=" + cantSalonesConf +
                ", cantSuites=" + cantSuites +
                ", cantLimosinas=" + cantLimosinas +
                ", gimnasio='" + categoriaGimnasio + '\'' +
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
    public double valorAggLimosinas(){
        return 15*this.cantLimosinas;
    }
    @Override
    public Double calcularPrecio(){
        this.precioHabitacion = super.calcularPrecio() + valorAggLimosinas();
        return this.precioHabitacion;
    }
}
