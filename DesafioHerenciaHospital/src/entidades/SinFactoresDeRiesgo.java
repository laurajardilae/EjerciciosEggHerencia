package entidades;

import java.util.List;

public class SinFactoresDeRiesgo extends Familia{
    protected boolean mejora;

    public SinFactoresDeRiesgo() {
    }

    public SinFactoresDeRiesgo(String ide) {
        super(ide);
    }

    public SinFactoresDeRiesgo(String direccion, String ide, Integer numeroLote, String barrio, String localidad, InfoVivienda infoVivienda, List<Integrante> integrantes, boolean mejora) {
        super(direccion, ide, numeroLote, barrio, localidad, infoVivienda, integrantes);
        this.mejora = mejora;
    }

    public boolean isMejora() {
        return mejora;
    }

    public void setMejora(boolean mejora) {
        this.mejora = mejora;
    }

    @Override
    public String toString() {
        return "SinFactoresDeRiesgo{" +
                "mejora=" + mejora +
                ", direccion='" + direccion + '\'' +
                ", ide='" + ide + '\'' +
                ", numeroLote=" + numeroLote +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", infoVivienda=" + infoVivienda +
                ", integrantes=" + integrantes +
                '}';
    }
}
