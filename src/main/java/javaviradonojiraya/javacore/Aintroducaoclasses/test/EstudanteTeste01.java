package javaviradonojiraya.javacore.Aintroducaoclasses.test;

import javaviradonojiraya.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Jaum";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //Por padrão as variáveis atribuidas ao objeto são inicializada com um valor padrão, 0 para tipo INT;
        //espaço em branco para tipo CHAR e 'null' para Strings;


    }
}
