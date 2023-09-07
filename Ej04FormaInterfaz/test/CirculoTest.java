import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Circulo circulo;
    @BeforeEach
    public void crearClase(){
        circulo = new Circulo();
    }

    @Test
    void calcularArea() {
        circulo.setRadio(10);
        circulo.calcularArea();
        assertEquals((Math.PI*100),circulo.getArea());
    }

    @Test
    void calcularPerimetro() {
        circulo.setRadio(10);
        circulo.calcularPerimetro();
        assertEquals((Math.PI*20),circulo.getPerimetro());
    }
}