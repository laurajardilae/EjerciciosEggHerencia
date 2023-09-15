package entidades;

public abstract class Extrahotelero extends Alojamiento{
    protected boolean privado;
    protected double metrosCuadrados;

    public Extrahotelero() {
    }

    public Extrahotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Extrahotelero{" +
                "privado=" + privado +
                ", metrosCuadrados=" + metrosCuadrados +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
