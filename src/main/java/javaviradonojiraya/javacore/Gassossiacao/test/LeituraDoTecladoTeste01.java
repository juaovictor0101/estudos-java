package javaviradonojiraya.javacore.Gassossiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para o seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("----------------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Nome: "+ sexo);

        /*
        Para fazer a leitura de dados digitados no console, é preciso usar uma classe
        chamada Scanner passando o argumento 'System.in'
         */
    }
}
