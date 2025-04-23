package javaviradonojiraya.javacore.Vio.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader("file.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha= br.readLine()) != null){
                System.out.println(linha);
            }
            br.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
