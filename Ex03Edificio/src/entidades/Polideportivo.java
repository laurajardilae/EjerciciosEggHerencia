package entidades;

public class Polideportivo extends Edificio {
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", techado=" + techado +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public double calcularSuperficie() {
        return largo*ancho;
    }
    public double calcularVolumen(){
        if(techado){
            return ancho*alto*largo;
        }else{
            return 0;
        }

    }
}
