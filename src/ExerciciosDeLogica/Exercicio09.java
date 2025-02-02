package ExerciciosDeLogica;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura
        e imprima na tela sua condição

        de acordo com a tabela abaixo:

        Fórmula do IMC = peso / (altura) ²

        Tabela Condições IMC


        Abaixo de 18,5   | Abaixo do peso

        Entre 18,6 e 24,9 | Peso ideal (parabéns)

        Entre 25,0 e 29,9 | Levemente acima do peso

        Entre 30,0 e 34,9 | Obesidade grau I

        Entre 35,0 e 39,9 | Obesidade grau II (severa)

        Maior ou igual a 40 | Obesidade grau III (mórbida)
         */

        double peso = 130;
        double altura = 1.75;

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal, parabens maninho ^^");
        } else if (IMC >= 25.0 && IMC < 29.9) {
            System.out.println("Levemente acima do peso, cuidado");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Obersidade grau I");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obersidade grau II");
        } else {
            System.out.println("Obersiadade grau III");
        }
    }

    //consegui! 01/02/2025
    //Acho que há como fazer isso de forma mais limpa, irei refazer no futuro;

}
