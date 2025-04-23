package javaviradonojiraya.javacore.ZZDoptional.test;

import javaviradonojiraya.javacore.ZZDoptional.domain.Manga;
import javaviradonojiraya.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("boku no hero");
        mangaByTitle.ifPresent(m-> m.setTitle("Boku no hero 2 modificado com sucesso"));
        System.out.println(mangaByTitle);

        Manga mangabyId = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangabyId);

        Manga newManga = MangaRepository.findByTitle("One piece")
                .orElse(new Manga(3, "One piece", 900));
        System.out.println(newManga);
    }
}
