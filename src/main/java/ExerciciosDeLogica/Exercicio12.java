package ExerciciosDeLogica;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha
        da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos
        da tabela de condições de pagamento para efetuar o cálculo adequado.

        Tabela de Código de Condições de Pagamento

        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        2 - À Vista no cartão de crédito, recebe 10% de desconto
        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do produto");
        Double preco = entrada.nextDouble();
        System.out.println(preco);

        System.out.println("Qual será a forma de pagamento? Informe o número opção que deseja");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int pag = entrada.nextInt();

        switch (pag) {
            case 1:
                preco -= preco * 0.15;
                System.out.println("O valor ficou em R$ "+ preco);
                break;
            case 2:
                preco -= preco *0.1;
                System.out.println("O valor do ficou em R$ "+ preco);
                break;
            case 3:
                System.out.println("O valor do ficou em R$ "+ preco);
                break;
            case 4:
                preco += preco * 0.1;
                System.out.println("O valor do ficou em R$ "+ preco);
                break;
            default:
                System.out.println("Informe um número entre 1 e 4");
                break;
        }

    }
}
