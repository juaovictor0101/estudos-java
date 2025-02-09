package javaviradonojiraya.javacore.Oexception.exeception.domain;

import javaviradonojiraya.javacore.Oexception.exeception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
