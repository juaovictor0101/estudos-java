package ExerciciosDeLogica;

public class Exercicio01 {
    public static void main(String[] args) {
 /*
 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B
     e mostre se a soma é menor que C.
 */
        int A = 2;
        int B = 6;
        int C = 6;

        int soma = A + B;

        System.out.println("A soma de A e B é: " + soma);
        if (soma < C) {
            System.out.println("A soma de A + B é: " + soma + " e é menor que " + C);

        } else {
            System.out.println(("A soma de A + B é: " + soma + " e é maior que " + C));
        }

    }
}
