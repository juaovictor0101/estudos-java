package javaviradonojiraya.javacore.Oexception.runtime.test;

public class RunTimeExepctionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }
                                                //forma de avisar que o metodo pode lançar essa exceção durante a execução
    private static int divisao (int a, int b) throws IllegalArgumentException {
        if (b ==0){
            throw new IllegalArgumentException("Argumento ilegal, informe um divisor válido");
        }
        return a/b;

        //Essa é uma forma de tratar exceções, e a de cima é uma outra.
//        try {
//            return a/b;
//
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }

}
