package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome1 = "João Victor";
//        String nome2 = new String("João Victor");
//        System.out.println(nome1 == nome2);
//        System.out.println(nome1.equals(nome2));
        // == comparada referencias
        // .equals compara o valor em sí;

        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
