package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Consumidor;
import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor(null, "João Victor");
        Consumidor consumidor2 = new Consumidor(null, "JV LTDA");
//        System.out.println(consumidor1);
        Manga manga1 = new Manga(5L, "Solo Leveling", 29.00);
        Manga manga2 = new Manga(1L, "Naruto Shippuden", 29.89);
        Manga manga3 = new Manga(4l, "Boku no Hero", 27.90);
        Manga manga4 = new Manga(3L, "Dragon Ball Z", 29.99);
        Manga manga5 = new Manga(2L, "Death Note", 20.00);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga5);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println("---" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-------" + manga.getNome());
            }

        }

    }
}
