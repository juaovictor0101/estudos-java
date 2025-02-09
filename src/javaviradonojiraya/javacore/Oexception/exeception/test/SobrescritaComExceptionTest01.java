package javaviradonojiraya.javacore.Oexception.exeception.test;

import javaviradonojiraya.javacore.Oexception.exeception.LoginInvalidoException;
import javaviradonojiraya.javacore.Oexception.exeception.domain.Funcionario;
import javaviradonojiraya.javacore.Oexception.exeception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

        /*
        Nesse caso, só foi 'cobrado' que fosse usado try catch na subclasse funcionário, porque nela, eu associei uma das
        exceções que tinha na super classe , e em casos de RuntimeException, não é obrigatório tratar para compilar o código
        por isso nesse caso, foi tratado apenas umas das exceções associadas ao metodo, e mesmo assim o código compila
         */
    }
}
