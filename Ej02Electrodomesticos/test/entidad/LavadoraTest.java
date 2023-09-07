package entidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavadoraTest {

    Lavadora lav;
    @BeforeEach
    void crearClase(){
        lav = new Lavadora();
    }
    @Test
    void precioFinalCargaLiviana() {
        lav.setConsumoEnergetico('F');
        lav.setPeso(10);
        lav.setCarga(10);
        lav.precioFinal();
        assertEquals(1200,lav.getPrecio());
    }
    @Test
    void precioFinalCargaPesada() {
        lav.setConsumoEnergetico('F');
        lav.setPeso(10);
        lav.setCarga(40);
        lav.precioFinal();
        assertEquals(1700,lav.getPrecio());
    }
}