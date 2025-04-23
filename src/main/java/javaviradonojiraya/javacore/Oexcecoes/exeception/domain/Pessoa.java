package javaviradonojiraya.javacore.Oexcecoes.exeception.domain;

import javaviradonojiraya.javacore.Oexcecoes.exeception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
