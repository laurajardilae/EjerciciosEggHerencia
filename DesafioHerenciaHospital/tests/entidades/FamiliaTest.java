package entidades;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FamiliaTest {
    ConFactoresDeRiesgo familia1 = new ConFactoresDeRiesgo();
    SinFactoresDeRiesgo familia2 = new SinFactoresDeRiesgo();
    Ninio ninio = new Ninio(11111,"Pepito", LocalDate.parse("2020-01-01"),"H",familia1 ); //3 años
    Joven joven = new Joven(22222,"Juan",LocalDate.parse("2007-02-10"),"O",familia1); //16
    Adulto adulto = new Adulto(3333, "Juliana", LocalDate.parse("1980-03-20"),"M",familia1); //43
    AdultoMayor adultoMayor = new AdultoMayor(4444, "Roberto",LocalDate.parse("1960-06-09"),"H",familia2);//63


    @Ignore
    void creacionDeDatosPrueba(){
        Ninio ninio = new Ninio(11111,"Pepito", LocalDate.parse("2020-01-01"),"H",familia1 ); //3 años
        Joven joven = new Joven(22222,"Juan",LocalDate.parse("2007-02-10"),"O",familia1); //16
        Adulto adulto = new Adulto(3333, "Juliana", LocalDate.parse("1980-03-20"),"M",familia1); //43
        AdultoMayor adultoMayor = new AdultoMayor(4444, "Roberto",LocalDate.parse("1960-06-09"),"H",familia2);//63

    }
    @Test
    void pruebaHerencia(){
        assertAll("Pruebas de herencia",
                () -> assertTrue(familia1 instanceof Familia),
                () -> assertTrue(familia2 instanceof Familia),
                () -> assertTrue(ninio instanceof Integrante),
                () -> assertTrue(joven instanceof Integrante),
                () -> assertTrue(adulto instanceof Integrante),
                () -> assertTrue(adultoMayor instanceof Integrante)
                );
    }

    @Test
    @DisplayName("prueba relaciones de herencia")
    void pruebaHerencia2() {
        assertAll(
                "pruebas de relaciones de herencia",
                () -> assertInstanceOf(Familia.class, new ConFactoresDeRiesgo()),
                () -> assertInstanceOf(Familia.class, new SinFactoresDeRiesgo()),
                () -> assertInstanceOf(Integrante.class, new Ninio()),
                () -> assertInstanceOf(Integrante.class, new Joven()),
                () -> assertInstanceOf(Integrante.class, new Adulto()),
                () -> assertInstanceOf(Integrante.class, new AdultoMayor())
        );
    }
}