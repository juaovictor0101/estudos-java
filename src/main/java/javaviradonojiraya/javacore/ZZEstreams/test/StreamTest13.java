package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.Category;
import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;
import javaviradonojiraya.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99, Category.FANTASY),
            new LightNovel("The tale of the princess Kaguya", 3.99, Category.DRAMA),
            new LightNovel("Black clover", 5.99, Category.FANTASY),
            new LightNovel("Cowboy bepop", 2.99, Category.DRAMA),
            new LightNovel("Sword Art Online", 2.99, Category.ROMANCE),
            new LightNovel("No game no life", 7.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(getLightNovelPromotionFunction()
                ));
        System.out.println(collect1);


        //Map<Category, Map< Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(getLightNovelPromotionFunction()
                )));
        System.out.println(collect2);
    }

    private static Function<LightNovel, Promotion> getLightNovelPromotionFunction() {
        return ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
