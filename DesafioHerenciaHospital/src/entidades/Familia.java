package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Familia {
    protected String direccion;
    protected String ide;
    protected Integer numeroLote;
    protected String barrio;
    protected String localidad;
    protected InfoVivienda infoVivienda;
    protected List<Integrante> integrantes = new ArrayList<>();

    public Familia() {
    }

    public Familia(String ide) {
        this.ide = ide;
    }

    public Familia(String direccion, String ide, Integer numeroLote, String barrio, String localidad, InfoVivienda infoVivienda, List<Integrante> integrantes) {
        this.direccion = direccion;
        this.ide = ide;
        this.numeroLote = numeroLote;
        this.barrio = barrio;
        this.localidad = localidad;
        this.infoVivienda = infoVivienda;
        this.integrantes = integrantes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Integer getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public InfoVivienda getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(InfoVivienda infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "direccion='" + direccion + '\'' +
                ", ide='" + ide + '\'' +
                ", numeroLote=" + numeroLote +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", infoVivienda=" + infoVivienda +
                ", integrantes=" + integrantes +
                '}';
    }
}
