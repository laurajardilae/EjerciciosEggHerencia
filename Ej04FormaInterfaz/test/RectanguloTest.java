import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    Rectangulo rectangulo;
    @BeforeEach
    public void crearObjeto(){
        rectangulo = new Rectangulo(4,2);
    }

    @Test
    void calcularArea() {
        rectangulo.calcularArea();
        assertEquals(8,rectangulo.getArea());
    }

    @Test
    void calcularPerimetro() {
        rectangulo.calcularPerimetro();
        assertEquals(12,rectangulo.getPerimetro());
    }
}