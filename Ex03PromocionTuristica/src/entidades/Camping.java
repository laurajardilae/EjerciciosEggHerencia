package entidades;

public class Camping extends Extrahotelero{
    private Integer capacidadCarpas;
    private Integer cantBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, Integer capacidadCarpas, Integer cantBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "capacidadCarpas=" + capacidadCarpas +
                ", cantBanios=" + cantBanios +
                ", tieneRestaurante=" + tieneRestaurante +
                ", privado=" + privado +
                ", metrosCuadrados=" + metrosCuadrados +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
