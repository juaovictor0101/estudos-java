package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.Category;
import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;
import javaviradonojiraya.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99, Category.FANTASY),
            new LightNovel("The tale of the princess Kaguya", 3.99, Category.DRAMA),
            new LightNovel("Black clover", 5.99, Category.FANTASY),
            new LightNovel("Cowboy bepop", 2.99, Category.DRAMA),
            new LightNovel("Sword Art Online", 2.99, Category.ROMANCE),
            new LightNovel("No game no life", 7.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);
    }
}
