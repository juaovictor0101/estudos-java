package javaviradonojiraya.javacore.Oexcecoes.exeception.test;

import javaviradonojiraya.javacore.Oexcecoes.exeception.domain.Leitor1;
import javaviradonojiraya.javacore.Oexcecoes.exeception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    lerArquivo();
    }


    /*
    Diferene do código 02, que fica sob responsabilidade total do dev lidar com as possíveis exceções
    que cada uma das funcionalidades Reader, pode trazer, o try with resources faz isso de forma mais direta
    ficando a própria JVM responsável por ler e fechar a conexão após a ultilização, no entanto, esse try só é possível
    ser usado com elementos que implementem a interface 'Closeable' ou 'AutoCloseable'

    Ao usar o try with resources, é possível não usar nem o catch e nem o finally, em casos que se use o throws para deixar
    com que a classe que chamar o metodo lide com a exceção que está sendo lançada

    Ao usar o try with resources, as requisições são fechadas na ordem inversa com que são chamadas, ou seja
    nesse exemplo, seria fechado primeiro o leitor2 e depois o leitor1
     */

    //try with resources

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1() ;
        Leitor2 leitor2 = new Leitor2()){

        } catch(IOException e){

        }
    }


    //try "comum"
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("texto.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

}
