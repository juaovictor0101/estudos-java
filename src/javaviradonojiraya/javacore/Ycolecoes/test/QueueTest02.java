package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Consumidor;
import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(2L, "Death Note", 28.99,0));
        mangas.add(new Manga(5L, "Solo Leveling", 24.99,0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 27.99,2));
        mangas.add(new Manga(4l, "Boku no Hero", 26.99,0));
        mangas.add(new Manga(1L, "Naruto Shippuden", 25.99,5));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
