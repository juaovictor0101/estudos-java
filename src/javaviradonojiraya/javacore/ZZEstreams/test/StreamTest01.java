package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
1. Order LightNovels by title
2. Retrieve the first 3 first LightNovels titles with price less than 4
 */

//Exercício sem usar Streams:
public class StreamTest01 {
        private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
                new LightNovel("Solo leveling", 8.99),
                new LightNovel("The tale of the princess Kaguya", 3.99),
                new LightNovel("Black clover", 5.99),
                new LightNovel("Cowboy bepop", 2.99),
                new LightNovel("No game no life", 7.99),
                new LightNovel("Super campeões", 1.99)
        ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice()<=4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size()>=3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
