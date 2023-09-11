package entidades;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerTest {

    @Test
    void pruebaHerencia(){
        Velero velero = new Velero();
        Motor motor = new Motor();
        Yate yate = new Yate();
        assertAll("Pruebas de relacion de herencia",
                () -> assertTrue(velero instanceof Barco),
                () -> assertTrue(motor instanceof Barco),
                () -> assertTrue(yate instanceof Motor),
                () -> assertTrue(yate instanceof Barco)
        );
    }
    @Test
    void pruebaCalculoModulo(){
        Barco barco = new Barco("1234",10,2000);
        Velero velero = new Velero("4567",5,2000,2);
        Motor motor = new Motor("7891", 7,2000,100);
        Yate yate = new Yate("2345",10,2000,200,10);
        assertAll("Pruebas de calculo de modulo",
                () -> assertEquals(100,barco.calculoModulo()),
                () -> assertEquals(52,velero.calculoModulo()),
                () -> assertEquals(170,motor.calculoModulo()),
                () -> assertEquals(310,yate.calculoModulo())
        );
    }
    @Test
    void pruebaCalculoAlquiler(){
        Barco barco = new Barco("1234",10,2000);
        Velero velero = new Velero("4567",5,2000,2);
        Motor motor = new Motor("7891", 7,2000,100);
        Yate yate = new Yate("2345",10,2000,100,10);

        Alquiler alquiler1 = new Alquiler("Laura",
                1234,
                LocalDate.of(2023,8,10),
                LocalDate.of(2023,8,20),
                1,
                barco);
        Alquiler alquiler2 = new Alquiler("Laura",
                1234,
                LocalDate.of(2023,8,10),
                LocalDate.of(2023,8,20),
                1,
                velero);
        Alquiler alquiler3 = new Alquiler("Laura",
                1234,
                LocalDate.of(2023,8,10),
                LocalDate.of(2023,8,20),
                1,
                motor);
        Alquiler alquiler4 = new Alquiler("Laura",
                1234,
                LocalDate.of(2023,8,10),
                LocalDate.of(2023,8,20),
                1,
                yate);

        assertAll("Pruebas de los diferentes casos de calculo de alquiler",
                () -> assertEquals(1000,alquiler1.calculoAlquiler()),
                () -> assertEquals(520,alquiler2.calculoAlquiler()),
                () -> assertEquals(1700,alquiler3.calculoAlquiler()),
                () -> assertEquals(2100,alquiler4.calculoAlquiler())
        );
    }
}