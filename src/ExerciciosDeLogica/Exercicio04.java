package ExerciciosDeLogica;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
         */
        int A = 5;
        int antecessorImediato = A - 1;
        int sucessorImediato = A + 1;
        System.out.println("O antecessor de " + A + " é " + antecessorImediato);
        System.out.println("O sucessor de " + A + " é " + sucessorImediato);
    }
}
