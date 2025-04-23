package javaviradonojiraya.javacore.BintroducaoMetodos.test;

import javaviradonojiraya.javacore.BintroducaoMetodos.domain.Estudante;
import javaviradonojiraya.javacore.BintroducaoMetodos.domain.ImpressoraEstudante;

/*
        PASSAGEM DE PARÂMETRO POR REFERÊNCIA

        Quando se passa objetos por argumentos, o que é passado na verdade é a referência desse objeto
 */
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Hinata";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.Imprime(estudante01);
        impressora.Imprime(estudante02);

        /*
        Usando o metodo 'Imprime' se economiza tempo de código e deixa o código mais coeso e
        mais fácil de manter a longo prazo;
        Nele se usou a passagem de parametro por referência onde o metodo referência o
        objeto estudante e com isso seu endereço e informações em memória para imprimir na tela
        os dados do estudante 01 e 02, ao inves de dar ctrl c/ctrl v toda vez que precisar expor
        os dados de um estudante, pode-se apenas chamar o metodo usando a referência ao objeto;

        ***Diferente da passagem de parametro em tipos primitivos,
        que pega uma cópia da variaveis para manipular, na passagem por referência altera as variáveis originais
        podendo causa uma confusão e um problema no momento de manipular, caso haja algum erro.
        */

//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("--------------------");
//
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);

        /*
        Ao inves de ficar repetindo o código com esse monte de println, é possivél criar um metodo que passará o objeto 'estudante'
        como argumento e chamar esse metodo que pegará a referência desse objeto sempre que preciso ao chamar
        o metodo 'Imprime'e mostrará na tela da mesma forma e escrevendo menos código.
         */

    }
}
