package javaviradonojiraya.javacore.ZZClambdas.test;

import javaviradonojiraya.javacore.ZZClambdas.domain.Anime;
import javaviradonojiraya.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 25), new Anime("One Piece", 50), new Anime("Fullmetal Alchemist", 57)));
        animeList.sort(animeComparators.compareByEpisodesNonStatic());
        System.out.println(animeList);


//        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes)-> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

    }
}
