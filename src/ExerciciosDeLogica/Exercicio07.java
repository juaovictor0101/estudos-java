package ExerciciosDeLogica;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
         */

        boolean teste01 = 5 < 1;
        boolean teste02 = 1 < 5;
        System.out.println(teste01);
        System.out.println(teste02);

        if (teste01 == true && teste02 == true) {
            System.out.println("ambos são verdadeiro");
        } else if (teste01 == true && teste02 == false){
            System.out.println("o teste1 é " + teste01 + " e o teste2 é" + teste02);
        } else if (teste01 == false && teste02 == true){
            System.out.println("O teste01 é falso e o teste 02 é verdadeiro");
        } else {
            System.out.println("ambos são falsos");
        }
        //NÃO CONSEGUI FAZER 26/01/2025
        //CONSEGUI FAZER!!! 01/02/2025
    }
}
