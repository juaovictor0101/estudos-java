package javaviradonojiraya.javacore.BintroducaoMetodos.domain;

public class Calculadora {

    /*
    Os dois métodos a seguir são sem passagem parâmetros, ou seja sem variáveis;
     */
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    //Esses método abaixo tem passagem de parâmetro e usa duas variáveis para isso;
    //Uma boa prática é manter os metodos com no máximo 3 variáveis, para evitar sobrecarrega-los;

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    //Outra forma de fazer o metodo acima é a seguinte, via void:

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por Zero.");
            return; //Isso é tipo um breakpoint (igual o usado em switch case mas que é usado em metodos do tipo void

        }
        System.out.println(num1 / num2);
    }

    /*
    Exemplo para usar passagem de parâmetro com tipos primitivos, no exemplo desse método alteraDoisNumeros
    é mostrado que quando é feito a passagem de parâmetro com tipos primitivos da classe para método
    o que é enviado na verdade é uma cópia da variável 'original' para ser manipulada no novo método;
    Na classe, a variável 'original' mantém seu valor
     */
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Detro do metodo alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... Numeros) {
        int soma = 0;
        for (int num : Numeros) {
            soma += num;
        }

        System.out.println(soma);
    }
}
