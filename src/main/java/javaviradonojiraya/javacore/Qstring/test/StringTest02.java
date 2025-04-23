package javaviradonojiraya.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        //Metódos úteis
        String nome = "        João Victor       "         ;
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("J", "4")); //troca letras da string por algo que queira
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim()); //remove os valores em branco que existem no começo e no fim da

        System.out.println("------------------------");
        System.out.println(numeros.substring(0,4)); //Percorre a string toda, com base nos indices que forem informados
        //O últimos indice considera o inicio da contagem e o último é o número informado -1
    }
}
