package javaviradonojiraya.javacore.Vio.Test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args)throws IOException  {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada? " + isDirectoryCreated);
//        ao criar um arquivo dentro do diretorio é possível fazer usando o endereço absoluto, ou usando a referência do objeto, nesse caso fileDirectory
//         //forma usando o endereço a absoluto
//        File fileArquivoDiretorio2 = new File ("C:\\Users\\Samsung\\Documents\\Estudos\\estudos java\\pasta\\aquivo.txt")
        File fileArquivoDiretorio = new File(fileDirectory, "arquivo.txt"); //usando a referência do obejto como caminho a ser criado o arquivo
        boolean isArquivoDiretorioCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo dentro da pasta criado? " +isArquivoDiretorioCreated);

//        Renomeando um arquivo do diretorio
//        caso não seja especificado o destino, e seja passado apenas o novo nome do arquivo, ele sai da pasta original (nesse caso o diretorio) e vai para uma pasta solta dentro do projeto;
//          Dessa forma o arquivo fica solto:
//        File fileRenamed = new File("arquivo_renomeado.txt");

        File fileRenamed = new File(fileDirectory,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Aquivo dentro da pasta foi renomeado? " +isRenamed);


//        Renomeando um diretorio
        File directoryRenamed = new File("pasta_renomeada");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Diretorio foi renomeado? " +isDirectoryRenamed);

    }
}
