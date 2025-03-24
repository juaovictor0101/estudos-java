package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Solo Leveling", 29.00,0));
        mangas.add(new Manga(1L, "Naruto Shippuden", 29.89,5));
        mangas.add(new Manga(4l, "Boku no Hero", 27.90,0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 29.99,2));
        mangas.add(new Manga(2L, "Death Note", 20.00,0));

        //      Forma ruim de tentar apagar elementos da lista:
//        for (Manga manga : mangas) {
//            if(manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }
//        }
        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        System.out.println("----------------");
        mangas.removeIf(manga -> manga.getQuantidade() ==0);
        System.out.println(mangas);
    }
}
