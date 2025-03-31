package javaviradonojiraya.javacore.ZZDoptional.repository;

import javaviradonojiraya.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(2, "naruto", 500), new Manga(1, "boku no hero", 50));


    //Metodos sem usar programação funcional:
//    private static Optional<Manga> findById(Integer id) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getId().equals(id)) {
//                found = manga;
//            }
//        }
//        return Optional.ofNullable(found);
//    }

//    private static Optional<Manga> findByTitle(String title) {
//        Manga found = null;
//        for (Manga manga : mangas) {
//            if (manga.getTitle().equals(title)) {
//                found = manga;
//            }
//        }
//        return Optional.ofNullable(found);
//    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitle(String title) {
       return findBy(m->m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
       return findBy(m-> m.getId().equals(id));
    }
}
