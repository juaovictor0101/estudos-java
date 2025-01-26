package ExerciciosDeLogica;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá
            somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos
            cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela;
         */
        int A = 5;
        int B = 6;
        int C;

        if(A==B){
            System.out.println("As variáveis tem valores iguais");
            C = A+B;
        } else {
            System.out.println("As variáveis tem valores diferentes");
            C= A*B;
        }
        System.out.println("O valor de C é: " + C);
    }
}
