package entidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisorTest {
    Televisor tv;
    @BeforeEach
    public void crearClase(){
        tv = new Televisor();
    }

    @Test
    void precioFinalBasico() {
        tv.setConsumoEnergetico('F');
        tv.setPeso(10);
        tv.setTdt(false);
        tv.setResolucion(30);
        tv.precioFinal();
        assertEquals(1200,tv.getPrecio());
    }
    @Test
    void precioFinalFull() {
        tv.setConsumoEnergetico('F');
        tv.setPeso(10);
        tv.setTdt(true);
        tv.setResolucion(50);
        tv.precioFinal();
        assertEquals(2060,tv.getPrecio());
    }
}