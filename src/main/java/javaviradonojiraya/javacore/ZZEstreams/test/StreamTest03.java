package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99),
            new LightNovel("The tale of the princess Kaguya", 3.99),
            new LightNovel("Black clover", 5.99),
            new LightNovel("Cowboy bepop", 2.99),
            new LightNovel("Cowboy bepop", 2.99),
            new LightNovel("No game no life", 7.99),
            new LightNovel("Super campeões", 1.99)
    ));

    public static void main(String[] args) {
            lightNovels.forEach(System.out::println);
        Stream<LightNovel> stream = lightNovels.stream();
        long count1 = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count1);

        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .map(LightNovel::getTitle)
                .count();
        System.out.println(count2);
    }
}
