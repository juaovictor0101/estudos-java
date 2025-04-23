package javaviradonojiraya.javacore.Oexcecoes.exeception.domain;

import javaviradonojiraya.javacore.Oexcecoes.exeception.LoginInvalidoException;

public class Funcionario extends Pessoa{

    /*
    Ao sobrescrever um metodo, não é obrigatório a declração das mesmas exceções que o metodo que tá sendo sobrescrito
    declarar.

    Mas em casos do metodo 'original' ter mais de uma exceção, há a possibilidade de ser declarado apenas uma delas, ou
    todas, caso seja necessário/queira

    Há a possibilidade de adcionar também qualquer exceção do tipo Unchecked, filhas de RunTimeException

    Não há a possibilidade de adcionar exceções mais genéricas ou do Tipo checked no Throws

    Não se metodo adcionar nenhuma outra exceção do tipo checked, caso ela não tenha sido declarada no metodo original
     */
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionario");
    }
}
