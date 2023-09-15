package entidades;

import enums.CategoriaPeso;

public class AbordajeNutricional {
    protected Integer ordenIntegrante;
    protected Integer edad;
    protected Double peso;
    protected CategoriaPeso categoriaPeso;

    public AbordajeNutricional() {
    }

    public AbordajeNutricional(Integer ordenIntegrante, Integer edad, Double peso, CategoriaPeso categoriaPeso) {
        this.ordenIntegrante = ordenIntegrante;
        this.edad = edad;
        this.peso = peso;
        this.categoriaPeso = categoriaPeso;
    }

    public Integer getOrdenIntegrante() {
        return ordenIntegrante;
    }

    public void setOrdenIntegrante(Integer ordenIntegrante) {
        this.ordenIntegrante = ordenIntegrante;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public CategoriaPeso getCategoriaPeso() {
        return categoriaPeso;
    }

    public void setCategoriaPeso(CategoriaPeso categoriaPeso) {
        this.categoriaPeso = categoriaPeso;
    }

    @Override
    public String toString() {
        return "AbordajeNutricional{" +
                "ordenIntegrante=" + ordenIntegrante +
                ", edad=" + edad +
                ", peso=" + peso +
                ", categoriaPeso=" + categoriaPeso +
                '}';
    }
}
