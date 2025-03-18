package javaviradonojiraya.javacore.WNio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtributeTest01 {
    public static void main(String[] args) throws IOException {
//        BasicFileAttributes
//        DosFileAttributes - windows
//        PosixFileAttributes - sistemas unix (macOS e linux)
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("/pasta/novo_path.txt");
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.createFile(path);
        Files.setLastModifiedTime(path,fileTime);

    }
}
