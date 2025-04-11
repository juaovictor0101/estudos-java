package javaviradonojiraya.javacore.Oexcecoes.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExepctionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro da ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println(" Dentro de RuntimeException");
        }

        /*
        Há a possibilidade de usar multiplos catch's, nesse caso ao lançar uma exceção, a JVM irá buscar nos catch's de
        de cima pra baixo, qual o primeiro que lida com essa exceção

        via de regra é que em casos do uso de multiplos catchs, começa a escrita da menos genérica, para a mais, porque
        caso a primeiro catch já seja a mais genérica de todas, há um erro de compilação.
         */

        /*
        Além desses multiplos catchs, há uma sintaxe que possibilita, colocar mais de uma exceção no mesmo catch, desde
        que elas NÃO estejam na mesma linha de herança e separados via |

        Ficaria da seguinte forma:
         */
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Tratando duas exceções de heranças diferentes em um só catch");
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
