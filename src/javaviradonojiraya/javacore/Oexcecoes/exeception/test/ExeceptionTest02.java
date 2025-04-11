package javaviradonojiraya.javacore.Oexcecoes.exeception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
/*informar "throws IOException" ao chamar o metodo, deixa por responsabilidade da próxima classe que chamar ela, a
responsabibilidade de tratar a exceção, caso não trate, ela não irá rodar,

 */
//    private static void criarNovoArquivo() throws IOException {
//        File file = new File("src/javaviradonojiraya/Arquivo\\teste.txt");
//        boolean isCriado = file.createNewFile();
//            System.out.println("Arquivo criado com sucesso " + isCriado);}
//
//            /*
//           - Além dessa forma de tratar de uma execeção, deixando o código mais injeçado, há a possibilidade de informar
//            e atribuir throws e a execeção que pode dar, que dessa forma, qualquer um que chamar o metodo, terá que tratar
//            da execeção a sua maneira, de acordo com cada caso específico.
//
//            -Uma boa forma de saber quando usar try catch pra tratar a exceção e quando usar throws + exeception, é seguir como
//            guia, metodo private : try catch, metodo public: throws + exeception
//
//             */
//    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("src/javaviradonojiraya/Arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

    /*
    Forma mais hibrida, que trata de alguma forma, mas abre margem para que a execeção seja trataas em outras classes,
    ou quando for chamada em outro momento também.

    **De forma mais suscinta, a forma como é feita a tratativa de execções vai depender muito do alinhamento da equipe e da
    forma como foi pensado o software e as decisões de arquietura que nele foram implantadas.**
     */


