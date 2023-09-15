package entidades;

public class ProblemaSalud {
    protected Integer ordenIntegrante;
    protected String ideFamilia;
    protected boolean hta;
    protected boolean dbt;

    public ProblemaSalud() {
    }

    public ProblemaSalud(boolean hta, boolean dbt) {
        this.hta = hta;
        this.dbt = dbt;
    }

    public Integer getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(Integer ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public String getIdeFamilia() {
        return ideFamilia;
    }

    public void setIdeFamilia(String ideFamilia) {
        this.ideFamilia = ideFamilia;
    }

    public boolean isHta() {
        return hta;
    }

    public void setHta(boolean hta) {
        this.hta = hta;
    }

    public boolean isDbt() {
        return dbt;
    }

    public void setDbt(boolean dbt) {
        this.dbt = dbt;
    }

    @Override
    public String toString() {
        return "ProblemaSalud{" +
                "ordenIntegrante=" + ordenIntegrante +
                ", ideFamilia='" + ideFamilia + '\'' +
                ", hta=" + hta +
                ", dbt=" + dbt +
                '}';
    }
}
