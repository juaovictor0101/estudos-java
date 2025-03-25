package javaviradonojiraya.javacore.Ycolecoes.test;

import javaviradonojiraya.javacore.Ycolecoes.domain.Manga;
import javaviradonojiraya.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); //TreeSet organiza a coleção de acordo com o compareTo usado na classe, ou do comparator criado para ordenar, nesse caso o da classe mangá é por ordem alfabetica
        mangas.add(new Manga(2L, "Death Note", 28.99,0));
        mangas.add(new Manga(5L, "Solo Leveling", 24.99,0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 27.99,2));
        mangas.add(new Manga(4l, "Boku no Hero", 26.99,0));
        mangas.add(new Manga(1L, "Naruto Shippuden", 25.99,5));

        //o metodo .descendingSet inverte a ordem, nesse caso da ordem A-Z, fica Z-A
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        /*
        Metodos úteis ao ordenar por preço:

       *lower < Traz o imediatamente menor da coleção, por ex, ao usar no exemplo no mangá de Naruto Shippuden, o imediatamente menor é Solo leveling;
       *floor <= Traz o igual ou imediatamente menor da coleção;
       *higher > Traz o imediatamente maior da coleção;
       *celling >= Traz o maior ou imediatamente igual da coleção;
       ex:
         */
        Manga pokemon = new Manga(10L,"Pokemon fire red",26,7);
        System.out.println("--------------");
        System.out.println(mangas.lower(pokemon)); //Vai trazer o imediatamente menor que é Naruto Shippuden nesse caso;
        System.out.println(mangas.floor(pokemon)); //Vai trazer o imediatamente menor, visto que não há nenhum com o preço igual
        System.out.println(mangas.higher(pokemon)); //Vai trazer o imediatamente maior
        System.out.println(mangas.ceiling(pokemon)); //Vai trazer o imediatamente maior, visto que não há nenhum com o preço igual;

        System.out.println("---------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //Retorna o primeiro elemento da lista e depois remove;
        System.out.println(mangas.size());

        System.out.println("----------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); //Retorna o último elemento da lista e depois remove;
        System.out.println(mangas.size());
    }
}
