package entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdificioTest {
    Polideportivo polideportivo;
    EdificioDeOficinas edificioDeOficinas;
    @BeforeEach
    void setUp(){
        polideportivo = new Polideportivo(15,5,28,"Lagos",false);
        edificioDeOficinas = new EdificioDeOficinas(10,15,10,3,5);
    }
    @Test
    void pruebaHerencia(){
        assertAll("Pruebas de herencia",
                () -> assertTrue(polideportivo instanceof Edificio),
                () -> assertTrue(edificioDeOficinas instanceof Edificio)
        );
    }

    @Test
    void calculosSuperficies(){
        assertAll("Pruebas de calculo de superficie",
                () -> assertEquals(420,polideportivo.calcularSuperficie()),
                () -> assertEquals(100,edificioDeOficinas.calcularSuperficie())
                );
    }
    @Test
    void calculosVolumen(){
        assertAll("Pruebas de calculo de superficie",
                () -> assertEquals(0,polideportivo.calcularVolumen()),
                () -> assertEquals(1500,edificioDeOficinas.calcularVolumen())
        );
    }
}