package javaviradonojiraya.javacore.Oexception.exeception.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
/*
Tratamento de exececões, em alguns metodos, eles informam o tipo de exececôes que podem ocorrer na execução do código
e nesse casos, não é possível compilar o código até que seja feita um bloco que informe que identificou o código e faça
algo sobre isso, normalmente é chamado o nome do erro, segue abaixo o código responsável por fazer isso, a partir do 'try'

Essa estrutura try/catch é basicamente um if else, só que nesse caso é especifico pora a tratativa de execeções

 */
    private static void criarNovoArquivo(){
        File file = new File("src/javaviradonojiraya/Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso " + isCriado);

        }catch(IOException e){
            e.printStackTrace();
            /*
            NÃO DEIXAR O CATCH SEM NENHUMA NOTIFICAÇÃO EM CASO DE ERRO PORQUE ISSO FAZ COM QUE O CÓDIGO "PAREÇA" CERTO
            EM ALGUNS CASOS!!

             */
        }
    }

}
