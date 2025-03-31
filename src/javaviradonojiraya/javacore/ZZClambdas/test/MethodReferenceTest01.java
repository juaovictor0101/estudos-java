package javaviradonojiraya.javacore.ZZClambdas.test;

import javaviradonojiraya.javacore.ZZClambdas.domain.Anime;
import javaviradonojiraya.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;


//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 25), new Anime("One Piece", 50), new Anime("Fullmetal Alchemist", 57)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
