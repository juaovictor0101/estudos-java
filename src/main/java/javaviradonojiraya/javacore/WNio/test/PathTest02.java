package javaviradonojiraya.javacore.WNio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
       //criando um diretório com NIO
        Path pastaPath = Paths.get("pasta"); //isso equivale a new FIle (Pasta)
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        //criando subdiretórios com NIO
        Path subPastaPatth = Paths.get("pasta/subpasta/subsupasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPatth);

        //criando um arquivo com NIO
        Path filePath = Paths.get(subPastaPatth.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        //copiando um arquivo com NIO
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target);
    }
}
