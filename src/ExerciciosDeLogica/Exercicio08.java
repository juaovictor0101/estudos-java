package ExerciciosDeLogica;

public class Exercicio08 {
    public static void main(String[] args) {
        //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        int A = 5;
        int B = 6;
        int C = 4;

        int maior = 0;
        int mediano = 0;
        int menor = 0;

        if (A > B) {
            maior = A;
            menor = B;
        } else if (B > A) {
            maior = B;
            menor = A;
        } else if (B > C) {
            maior = B;

        } else if (C > A) {
            mediano = C;
            menor = A;
        }

        System.out.println(maior);
        System.out.println(mediano);
        System.out.println(menor);
    }


    //não consegui. 01/02/2024
}
