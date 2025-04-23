package javaviradonojiraya.javacore.URegex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        //Meta caracteres
        /*
        \d = Retorna todos os digitos
        \D = Retorna tudo que não for digitos
        \s = retorna todos os espaços em brancos \t \n \f \r
        \S = retorna todos os caracteres excluindo os espaços em branco
        \w = retorna tudo de a-z e A-Z, digitos e _
        \W = retorna tudo que não for incluso no \w
        [] = range de caractere, especificando o que busca dentro do range, ele faz a procura de acordo, podendo ser a-Z (para especificar uma procura dentro do range de A-Z por ex


         */
        //buscando tudo que não é digito
//        String regex = "[abc]";
        //ou
        String regex = "[a-z]";
        String texto = "cafeBABe";
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
        //fazendo buscas de acordo com o range que eu passei, nesse caso buscando números hexadecimais
        String regex2 = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0xKFFFF 0x123ff 0X3450FC";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("texto:   " + texto2);
        System.out.println("indice:  0123456790" );
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");

        while (matcher2.find()){
            System.out.print(matcher2.start() + " " + matcher2.group()+"\n");
            System.out.println();
        }


    }
}
