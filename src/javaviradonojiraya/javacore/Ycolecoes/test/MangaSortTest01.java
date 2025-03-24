package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Solo Leveling",29.00));
        mangas.add(new Manga(1L,"Naruto Shippuden",29.89));
        mangas.add(new Manga(4l,"Boku no Hero",27.90));
        mangas.add(new Manga(3L,"Dragon Ball Z",29.99));
        mangas.add(new Manga(2L,"Death Note",20.00));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
