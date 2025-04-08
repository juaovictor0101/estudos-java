package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.Category;
import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99, Category.FANTASY),
            new LightNovel("The tale of the princess Kaguya", 3.99, Category.DRAMA),
            new LightNovel("Black clover", 5.99, Category.FANTASY),
            new LightNovel("Cowboy bepop", 2.99, Category.DRAMA),
            new LightNovel("Sword Art Online", 2.99, Category.ROMANCE),
            new LightNovel("No game no life", 7.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> lightNovelCategoryMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA : drama.add(lightNovel);break;
                case FANTASY: fantasy.add(lightNovel);break;
                case ROMANCE: romance.add(lightNovel);break;
            }
        }
        lightNovelCategoryMap.put(Category.DRAMA, drama);
        lightNovelCategoryMap.put(Category.FANTASY, fantasy);
        lightNovelCategoryMap.put(Category.ROMANCE, romance);

        System.out.println(lightNovelCategoryMap);

        System.out.println("------");
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
