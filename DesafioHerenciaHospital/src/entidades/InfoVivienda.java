package entidades;

import enums.TipoPared;
import enums.TipoPiso;

public class InfoVivienda {
    protected Integer numeroDomitorios;
    protected boolean iluminacion;
    protected TipoPared tipoPared;
    protected TipoPiso tipoPiso;

    public InfoVivienda() {
    }

    public Integer getNumeroDomitorios() {
        return numeroDomitorios;
    }

    public void setNumeroDomitorios(Integer numeroDomitorios) {
        this.numeroDomitorios = numeroDomitorios;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    public TipoPared getTipoPared() {
        return tipoPared;
    }

    public void setTipoPared(TipoPared tipoPared) {
        this.tipoPared = tipoPared;
    }

    public TipoPiso getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(TipoPiso tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    @Override
    public String toString() {
        return "InfoVivienda{" +
                "numeroDomitorios=" + numeroDomitorios +
                ", iluminacion=" + iluminacion +
                ", tipoPared=" + tipoPared +
                ", tipoPiso=" + tipoPiso +
                '}';
    }
}
