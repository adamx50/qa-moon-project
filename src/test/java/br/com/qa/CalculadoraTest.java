package br.com.qa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.somar(2, 3), "A soma de 2 e 3 deve ser 5");
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtrair(5, 4), "A subtração de 5 e 4 deve ser 1");
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(12, calculadora.multiplicar(3, 4), "A multiplicação de 3 e 4 deve ser 12");
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(6, 3), "A divisão de 6 por 3 deve ser 2");
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });
        assertEquals("Não é possível dividir por zero!", exception.getMessage());
    }
}
