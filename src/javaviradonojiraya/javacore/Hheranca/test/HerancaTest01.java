package javaviradonojiraya.javacore.Hheranca.test;

import javaviradonojiraya.javacore.Hheranca.domain.Endereco;
import javaviradonojiraya.javacore.Hheranca.domain.Funcionario;
import javaviradonojiraya.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua do bolinha 3");
        endereco.setCep("303979 - 000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joaozinho");
        pessoa.setCpf("112220");
        pessoa.setEndereco(endereco);
        System.out.println("---------Dados da pessoa ---------");
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maria");
        funcionario.setCpf("111-222-333-44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4500.55);
        System.out.println("-----------Dados do funcionario------------");
        funcionario.imprime();
        funcionario.relatorioSalario();

    }
}
