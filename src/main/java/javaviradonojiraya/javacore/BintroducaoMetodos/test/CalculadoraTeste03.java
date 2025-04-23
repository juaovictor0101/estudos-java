package javaviradonojiraya.javacore.BintroducaoMetodos.test;

import javaviradonojiraya.javacore.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = Calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);

        calculadora.imprimeDivisaoDeDoisNumeros(24,0);
    }
}
