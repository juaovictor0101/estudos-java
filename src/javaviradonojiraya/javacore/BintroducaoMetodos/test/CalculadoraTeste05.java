package javaviradonojiraya.javacore.BintroducaoMetodos.test;

import javaviradonojiraya.javacore.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTeste05 {

    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArrays(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }

    /*
    Exemplo acima se a passagem de parametro usando arrays;
    No segundo metodo mostrado usa-se VarArgs, é basicamente uma forma mais fácil de usar arrays
    em passagens de parametro de arrays com elementos do mesmo tipo;
    */
}
