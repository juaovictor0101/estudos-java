package ExerciciosDeLogica;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
         13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é
          maior ou menor de idade.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = entrada.nextLine();
        System.out.println("Qual a sua idade? ");
        int idade = entrada.nextInt();

        if (idade>= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }
    }
}
