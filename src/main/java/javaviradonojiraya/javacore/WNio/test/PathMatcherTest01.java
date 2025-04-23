package javaviradonojiraya.javacore.WNio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpsta/file.bkp");
        Path path2 = Paths.get("pasta/subpsta/file.txt");
        Path path3 = Paths.get("pasta/subpsta/file.java");

        matcher(path1, "glob:*.bkp");
        matcher(path1, "glob:**.bkp");
        matcher(path1, "glob:**/*.{bkp,txt,java}"); //não usar espaço ao procurar por um 'grupo' de arquivos
        matcher(path2, "glob:**/*.{bkp,txt,java}");
        matcher(path3, "glob:**/*.{bkp,txt,java}");
        matcher(path1, "glob:**/*.???"); //busca por arquivos que terminem com 3 letras depois do ponto
        matcher(path2, "glob:**/*.???");
        matcher(path3, "glob:**/*.???");
        matcher(path3, "glob:**/file.???"); //busca pelo nome do arquivo
    }

    //glob = regex simplificada, se precisar usar isso poder ler a documentação que explica melhor sobre o uso
    private static void matcher(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}

