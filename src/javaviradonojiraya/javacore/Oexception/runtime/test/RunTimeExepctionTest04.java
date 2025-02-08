package javaviradonojiraya.javacore.Oexception.runtime.test;

public class RunTimeExepctionTest04 {
    public static void main(String[] args){
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro de IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro da ArithmeticException");
        }catch (RuntimeException e){
            System.out.println(" Dentro de RuntimeException");
        }

        /*
        Há a possibilidade de usar multiplos catch's, nesse caso ao lançar uma exceção, a JVM irá buscar nos catch's de
        de cima pra baixo, qual o primeiro que lida com essa exceção

        via de regra é que em casos do uso de multiplos catchs, começa a escrita da menos genérica, para a mais, porque
        caso a primeiro catch já seja a mais genérica de todas, há um erro de compilação.
         */
    }
}
