package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {
    Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testSoma() {
        assertEquals(7, calc.soma(3, 4));
    }

    @Test
    public void testSubtracao() {
        int resultado = calc.subtracao(9, 5);
        assertEquals(4, resultado);
    }

    @Test
    public void testMultiplicacao() {
        int resultado = calc.multiplicacao(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testDivisao() {
        double resultado = calc.divisao(10, 3);
        assertEquals(3.33, resultado, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisaoZero() {
        double resultado = calc.divisao(5, 0);
    }

    @Test
    public void testRaiz() {
        double resultado = calc.raiz(9, 2);
        assertEquals(3, resultado, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaizNegativa() {
        double resultado = calc.raiz(-9, 2);
    }

    @Test
    public void testPotencia() {
        double resultado = calc.potencia(2, 2);
        assertEquals(4, resultado, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaNegativa(){
        double resultado = calc.potencia(-1, 0.1);
    }


}
