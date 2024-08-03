package lab3.JonerClaudio.scafolding.operadores;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperadoresAritmeticosTest {

    @Test
    void suma() {
        int resultado = OperadoresAritmeticos.suma(7,5);

        assertEquals(12,resultado);
        assertNotEquals(15,resultado);
    }

    @Test
    @DisplayName("SumaTest")
    void sumaTest() {
        int resultado = OperadoresAritmeticos.suma(7,5);

        assertEquals(12,resultado);
        assertNotEquals(15,resultado);
    }

    @Test
    @DisplayName("SumaTest assertAll()")
    void sumaTestAll() {
        int resultado = OperadoresAritmeticos.suma(7,5);
        assertAll(
                () -> assertEquals(12,resultado),
                () -> assertNotEquals(15,resultado)
        );
    }

    @Test
    @DisplayName("SumaTest AssertTrue")
    void sumaTrue() {
        int resultado = OperadoresAritmeticos.suma(7,5);

        assertTrue(resultado > 1);
        assertFalse(resultado < 1);

        //assertTrue(resultado == 1); Se rompe
    }
}