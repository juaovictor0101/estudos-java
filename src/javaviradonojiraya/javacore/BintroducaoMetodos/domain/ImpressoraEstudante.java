package javaviradonojiraya.javacore.BintroducaoMetodos.domain;

public class ImpressoraEstudante {
    public void Imprime(Estudante estudante) {

        /*
        Aqui por exemplo se eu der um novo valor ao 'estudante.nome', por exemplo, ele terá esse valor
        alterado em sua classe também e não apenas no metodo, porque a passagem por referência pega
        a referência, os dados de fato e não uma cópia como acontece em tipos primitivos.
         */

        System.out.println("--------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
