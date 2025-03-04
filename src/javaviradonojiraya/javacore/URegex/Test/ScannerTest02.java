package javaviradonojiraya.javacore.URegex.Test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Jaum, Victor, Santos, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Inteiro: " +i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Booleano: "+b);
            }
            else {
                System.out.println(scanner.next());
            }
        }

    }
}
