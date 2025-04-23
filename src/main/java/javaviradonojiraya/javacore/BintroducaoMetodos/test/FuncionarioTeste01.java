package javaviradonojiraya.javacore.BintroducaoMetodos.test;

import javaviradonojiraya.javacore.BintroducaoMetodos.domain.Funcionario;


public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jaum");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});


        funcionario.imprime();

    }
}
