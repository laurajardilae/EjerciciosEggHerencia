package entidad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectrodomesticoTest {

    Electrodomestico elec;

    @BeforeEach
    public void crearClase(){
        elec = new Electrodomestico();
    }

    @Test
    void comprobarConsumoEnergeticoMinuscula() {
        assertEquals('A', elec.comprobarConsumoEnergetico('a'));
    }
    @Test
    void comprobarConsumoEnergeticoFueraDeRango() {
        assertEquals('F', elec.comprobarConsumoEnergetico('p'));
    }

    @Test
    void comprobarColorCorrecto() {
        assertEquals("negro",elec.comprobarColor("negro"));
    }
    @Test
    void comprobarColorFueraDeRango() {
        assertEquals("blanco",elec.comprobarColor("fucsia"));
    }

    @Test
    void precioFinalPesadoyAltoConsumo() {
        Electrodomestico elec1 = new Electrodomestico("blanco",'A',90);
        elec1.precioFinal();
        assertEquals(3000,elec1.getPrecio());
    }
    @Test
    void precioFinalLivianoyBajoConsumo() {
        Electrodomestico elec2 = new Electrodomestico("blanco",'F',10);
        elec2.precioFinal();
        assertEquals(1200,elec2.getPrecio());
    }
}