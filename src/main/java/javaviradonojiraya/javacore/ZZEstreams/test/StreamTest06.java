package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 10)); //há algum?
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); //todos são?
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0)); //todos NÃO são?

        lightNovels.stream()
                .filter(ln -> ln.getPrice()>3)
                .findAny()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln->ln.getPrice()>3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
