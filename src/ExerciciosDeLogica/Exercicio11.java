package ExerciciosDeLogica;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
         11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na
          tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média
           final deve ser maior ou igual a 7.
         */

        String nomeAluno = "Jaum";
        double nota1 = 5;
        double nota2 = 9;
        double media = (nota1 + nota2) / 2;
        if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado!!");
        }
    }
}
