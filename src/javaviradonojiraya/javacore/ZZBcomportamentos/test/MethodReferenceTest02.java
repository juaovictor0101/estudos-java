package javaviradonojiraya.javacore.ZZBcomportamentos.test;

import javaviradonojiraya.javacore.ZZClambdas.Domain.Anime;
import javaviradonojiraya.javacore.ZZClambdas.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 25), new Anime("One Piece", 50), new Anime("Fullmetal Alchemist", 57)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1,a2)->animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
