package com.example;

public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public double raiz(int a, int b) {
        if (a < 0 && b % 2 == 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz enésima de um número negativo para b par.");
        }
        return Math.pow(a, 1.0 / b);
    }

    public double potencia(double base, double expoente) {
        if (base < 0 && expoente % 1 != 0) {
            throw new IllegalArgumentException("Não é possível calcular a potência de uma base negativa com um expoente não inteiro.");
        }
        return Math.pow(base, expoente);
    }
    
    
    
    
}
