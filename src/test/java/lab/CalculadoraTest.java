package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void sumaDosNumeros() {
        assertEquals(6, new Calculadora().sumar(2, 3));
    }
}
