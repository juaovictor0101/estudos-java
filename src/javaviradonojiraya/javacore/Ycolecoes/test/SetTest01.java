package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        /*
        hashset não armazena valores iguais, ou seja não há duplicidade, e ele ordena de acordo com o hashcode.
        caso seja necessário mostrar os elementos na ordem de inserção é possível usar o LinkedHashSet

         */
        Set< Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Solo Leveling", 29.00,0));
        mangas.add(new Manga(1L, "Naruto Shippuden", 29.89,5));
        mangas.add(new Manga(4l, "Boku no Hero", 27.90,0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 29.99,2));
        mangas.add(new Manga(2L, "Death Note", 20.00,0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
