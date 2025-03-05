package javaviradonojiraya.javacore.Vio.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        // File
        // FileWriter
        // FilerReader
        // BufferedWriter
        // BufferedReader
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Teste 123 \n ");
            fw.flush();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}