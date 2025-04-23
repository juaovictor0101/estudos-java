package javaviradonojiraya.javacore.Vio.Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("Directory? "+ file.isDirectory());
            System.out.println("File? "+ file.isFile());
            System.out.println("Hidden? " + file.isHidden());
            System.out.println("Modificado? " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
