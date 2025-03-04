package javaviradonojiraya.javacore.URegex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        /*
        Quantificadores:
        ? = Zero ou uma ocorrência
        * = Zero ou mais
        + = Uma ou mais
        {n,m} = De n até m, por ex {5,10} de 5 a 10 ocorrências
        () = agrupamento
        | = Ou
        $ = fim da linha
        . = caracter coringa, ele busca por exemplo, ao colocar 1.3 ele retornara todas as expressões que tenha 1 no começo e 3 no final, independente do caracter que esteja ao meio, 1.3 = 1#3, 1@3, 1!3, 123
         */

        String regex = "0[xX]([0-9a-fA-F])+ (\\s|$)";
        String texto = "12 0x 0xAFFFF 0x123ffG 0X3450FC";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+"\n");
            System.out.println();
        }


    }
}
