package javaviradonojiraya.javacore.Oexception.exeception.test;

import javaviradonojiraya.javacore.Oexception.exeception.LoginInvalidoException;

import java.util.Scanner;

public class LoginIvalidoExceptionTest01 {
    //criando uma exceção custom
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar () throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha");
        String senhaDigitada = teclado.nextLine();

        if(! usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos, tente novamente");
        }
        System.out.println("Usuário logado com sucesso");
    }

}
