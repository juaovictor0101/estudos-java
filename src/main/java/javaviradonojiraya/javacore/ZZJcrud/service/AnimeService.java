package javaviradonojiraya.javacore.ZZJcrud.service;

import javaviradonojiraya.javacore.ZZJcrud.domain.Anime;
import javaviradonojiraya.javacore.ZZJcrud.domain.Producer;
import javaviradonojiraya.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {

        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();

        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        List<Anime> animes = AnimeRepository.findByName(name);
        animes.forEach(p -> System.out.printf("[%d] -  name: %s - episodes: %d - producer: %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    private static void delete() {
        findByName();
        System.out.println("Type the id of the anime you want delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N ");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number os episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update(){
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> optionalAnime = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(optionalAnime.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = optionalAnime.get();
        System.out.println("Anime found: "+animeFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty()? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToUpdate);

    }


}
