package entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlojamientoTest {
    private HotelCuatroEstrellas cuatroEstrellas;
    private HotelCincoEstrellas cincoEstrellas;
    private Camping camping;
    private Residencia residencia;

    @BeforeEach
    void creacionClases(){
        cuatroEstrellas = new HotelCuatroEstrellas();
        cincoEstrellas = new HotelCincoEstrellas();
        camping = new Camping();
        residencia = new Residencia();

    }

    @Test
    void pruebaHerencia(){
        assertAll("Verificacion de herencia",
                () -> assertTrue(cuatroEstrellas instanceof Hotel),
                () -> assertTrue(cincoEstrellas instanceof HotelCuatroEstrellas),
                () -> assertTrue(camping instanceof Extrahotelero),
                () -> assertTrue(residencia instanceof Alojamiento)
        );
    }
    @Test
    void calculosPrecio(){
        cuatroEstrellas.setCantHabitaciones(10); //60
        cuatroEstrellas.setGimnasio("A"); //50
        cuatroEstrellas.setCapacidadRestaurante(25); //10

        cincoEstrellas.setCantHabitaciones(10); //60
        cincoEstrellas.setGimnasio("A"); //50
        cincoEstrellas.setCapacidadRestaurante(25); //10
        cincoEstrellas.setCantLimosinas(2); //30

        assertAll("Precios",
                () -> assertEquals(120,cuatroEstrellas.calcularPrecio()),
                () -> assertEquals(150,cincoEstrellas.calcularPrecio())
        );
    }
}