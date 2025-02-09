package javaviradonojiraya.javacore.Oexception.exeception;
//criando uma exceção custom
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super ("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
