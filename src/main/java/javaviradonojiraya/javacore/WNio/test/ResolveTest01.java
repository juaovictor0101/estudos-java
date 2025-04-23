package javaviradonojiraya.javacore.WNio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/victor");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/victor");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("arquivo.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 "+ absoluto.resolve(file));
        System.out.println("3 "+ relativo.resolve(absoluto));
        System.out.println("4 "+ relativo.resolve(file));
        System.out.println("5 "+ file.resolve(absoluto));
        System.out.println("6 "+ file.resolve(absoluto));

        //caminho absoluto resolve relativo
        //caminho relativo nao resolve absoluto
        //Basicamente ao passar um caminho absoluto pelo resolve, ele considera apenas o caminho absoluto;
    }
}
