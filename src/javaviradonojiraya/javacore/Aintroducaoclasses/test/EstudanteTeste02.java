package javaviradonojiraya.javacore.Aintroducaoclasses.test;

import javaviradonojiraya.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Victor";

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

        System.out.println("------------------------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);

        /*
        Ter cuidado ao inicializar objetos já com suas declarações porque
         TODOS os seguintes virão com esses moldes.

        Que nesse caso seria o nome "jaum" já atribuido por padrão, ao invés
         do usual 'null', se fazendo necessário uma atribuição para mudar, o que pode confundir o código;
         */

        /*
        No exemplo acima, o primeiro dado irá vir com os padrões de variável
        com exceção do nome, porque como foi declarado no dominio, todos os novos
        objetos já virão com 'jaum' por padrão como nome, foi preciso declarar novamente
        o nome conforme descrito no "Estudante2.nome = "Victor"; " para mudar esse padrão.
         */

    }
}
