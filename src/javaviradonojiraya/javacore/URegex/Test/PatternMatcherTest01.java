package javaviradonojiraya.javacore.URegex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
            System.out.println();
        }


        System.out.println("--------------------------");
        String regex2 = "aba";
        String texto2 = "abababa";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto:   " + texto2);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex2);
        System.out.println("Posições encontradas");
        while (matcher2.find()){
            System.out.print(matcher2.start() + " ");
        }

    }
}
