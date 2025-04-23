package javaviradonojiraya.javacore.URegex.Test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Jaum, Victor, Santos";
        String [] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
