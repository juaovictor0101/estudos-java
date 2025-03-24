package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);
        mangas.add("Solo Leveling");
        mangas.add("Naruto Shippuden");
        mangas.add("Boku no Hero");
        mangas.add("Dragon Ball Z");
        mangas.add("Death Note");
        mangas.add("Attack on Titan");
        Collections.sort(mangas); //ordena em ordem alfabetica em casos de Strings, com números, ficaria do menor para o maior
        for (String manga: mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(11.20);
        dinheiros.add(1124.24);
        dinheiros.add(112.50);
        dinheiros.add(1321.90);
        System.out.println("--------------------");
        Collections.sort(dinheiros);
        for (Double dinheiro: dinheiros){
            System.out.println(dinheiro);
        }

    }
}
