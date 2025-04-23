package javaviradonojiraya.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "João";
        nome.concat("Victor");
        System.out.println(nome);

        System.out.println("-----------");
        StringBuilder sb = new StringBuilder("João Victor");
        sb.append(" Dev Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println("---------");
        System.out.println(sb);
    }
}
