package javaviradonojiraya.javacore.WNio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends java.nio.file.SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre visit " + dir.getFileName());
        return FileVisitResult.SKIP_SUBTREE; //= pre visita apenas a pasta
//        return FileVisitResult.CONTINUE; = pre visita tudo dentro da pasta
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
        //faz o contrário do preVisit, lista na ordem contrária também.
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());

    }
}
