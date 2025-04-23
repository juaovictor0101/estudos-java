package ExerciciosDeLogica;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e
        imprima na tela os valores.
         */

        int A = 3;
        int B = 2;
        int aux;
        aux=A;
        A=B;
        B=aux;
        System.out.println(A);
        System.out.println(B);
    }
}
