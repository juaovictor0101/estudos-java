package javaviradonojiraya.javacore.URegex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        //Meta caracteres
        /*
        \d = Retorna todos os digitos
        \D = Retorna tudo que não for digitos
        \s = retorna todos os espaços em brancos \t \n \f \r
        \S = retorna todos os caracteres excluindo os espaços em branco
        \w = retorna tudo de a-z e A-Z, digitos e _
        \W = retorna tudo que não for incluso no \w

         */
        //buscando tudo que não é digito
        String regex = "\\D";
        String texto = "a@##!b22lksk234kslks5";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n ");
            System.out.println();
        }


        //buscando tudo que não for digito
        System.out.println("--------------------------");
        String regex2 = "\\d";
        String texto2 = "a@##!b22lksk234kslks5";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto:   " + texto2);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex2);
        System.out.println("Posições encontradas");
        while (matcher2.find()){
            System.out.print(matcher2.start() + " " + matcher2.group() +"\n");
        }

    }
}
