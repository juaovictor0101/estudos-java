package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

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
        //sem collect
        System.out.println(lightNovels.stream().count());
        //com collect
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        //sem collect
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        //com collect
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        //sem collect
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        //com collect
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
