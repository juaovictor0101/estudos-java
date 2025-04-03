package javaviradonojiraya.javacore.ZZEstreams.test;

import javaviradonojiraya.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Fazendo o mesmo exercicio do exemplo anterior mas agora usando streams:
public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Solo leveling", 8.99),
            new LightNovel("The tale of the princess Kaguya", 3.99),
            new LightNovel("Black clover", 5.99),
            new LightNovel("Cowboy bepop", 2.99),
            new LightNovel("No game no life", 7.99),
            new LightNovel("Super campeões", 1.99)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
