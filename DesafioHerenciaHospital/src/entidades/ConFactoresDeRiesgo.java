package entidades;

import java.util.ArrayList;
import java.util.List;

public class ConFactoresDeRiesgo extends Familia{
    protected List<Integer> factores = new ArrayList<>();

    public ConFactoresDeRiesgo() {
    }

    public ConFactoresDeRiesgo(String ide) {
        super(ide);
    }

    public ConFactoresDeRiesgo(String direccion, String ide, Integer numeroLote, String barrio, String localidad, InfoVivienda infoVivienda, List<Integrante> integrantes, List<Integer> factores) {
        super(direccion, ide, numeroLote, barrio, localidad, infoVivienda, integrantes);
        this.factores = factores;
    }

    public List<Integer> getFactores() {
        return factores;
    }

    public void setFactores(List<Integer> factores) {
        this.factores = factores;
    }

    @Override
    public String toString() {
        return "ConFactoresDeRiesgo{" +
                "factores=" + factores +
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
