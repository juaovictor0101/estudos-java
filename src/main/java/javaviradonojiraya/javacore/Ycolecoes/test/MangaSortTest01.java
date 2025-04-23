package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
    /*
    Em casos de trabalho que já tenha um comparable sendo usado por padrão na lógica de negócio, e surja a necessidade
    de uma ordenação específica para alguma parte do software, é possível usar o comparator para lançar uma nova forma sem quebrar o código.
     */
class SortMangaByI implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Solo Leveling", 29.00));
        mangas.add(new Manga(1L, "Naruto Shippuden", 29.89));
        mangas.add(new Manga(4l, "Boku no Hero", 27.90));
        mangas.add(new Manga(3L, "Dragon Ball Z", 29.99));
        mangas.add(new Manga(2L, "Death Note", 20.00));
        System.out.println("Mangas sem ordem: ");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("Mangas por ordem alfabetica: ");
        Collections.sort(mangas);
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("Mangas por ordem via ID: ");         //Via comparator
        Collections.sort(mangas, new SortMangaByI());
        System.out.println("------------");
        for (Manga manga : mangas) {

            System.out.println(manga);
        }
    }
}
