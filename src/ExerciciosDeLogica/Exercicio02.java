package ExerciciosDeLogica;

public class Exercicio02 {
    public static void main(String[] args) {
       /*
       2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        */

        int num = 150;

        String mensagemPar = "O número é par";
        String mensagemImpar = "O número é impar";

        String parOuImpar = num % 2 == 0 ? mensagemPar : mensagemImpar;
        System.out.println(parOuImpar);

        String positivoNegativo = num >= 0 ? "O número é positivo" : "O número é negativo";
        System.out.println(positivoNegativo);

    }
}

