package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        //aqui está usando boxing e unboxing pelo java (transformando um tipo primitivo em um Wrapper) -performance
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price >3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        //aqui estou lidando diretamente com um tipo primitivo, sem boxging (+performance)
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);

    }
}
