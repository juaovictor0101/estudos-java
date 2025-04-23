package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.Category;
import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;
import javaviradonojiraya.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {

    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99, Category.FANTASY),
            new LightNovel("The tale of the princess Kaguya", 3.99, Category.DRAMA),
            new LightNovel("Black clover", 5.99, Category.FANTASY),
            new LightNovel("Cowboy bepop", 2.99, Category.DRAMA),
            new LightNovel("Sword Art Online", 2.99, Category.ROMANCE),
            new LightNovel("No game no life", 7.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

       Map<Category, List<Promotion>> collect1 = lightNovels.stream()
               .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15.getPromotion(), Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15.getPromotion(), Collectors.toSet())));
        System.out.println(collect2);


        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15.getPromotion(), Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);


    }

    private static Function<LightNovel, Promotion> getPromotion() {
        return ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
