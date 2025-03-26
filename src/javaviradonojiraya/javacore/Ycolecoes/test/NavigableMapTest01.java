package javaviradonojiraya.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        //da mesma forma que o Set (hashset, TreeSet e etc) ordena, o TreeMap também, mas de acordo com a Chave
        //Isso resulta que da mesma forma que Set precisa que a classe implemente comparable ou que seja passado um comparator, aqui segue a mesma regra
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.headMap("C")); //isso retorna tudo que vem antes do C após ser ordenado o Map, nesse caso, A e B
        System.out.println(map.headMap("C", true)); // nesse caso inclui também a chave informada, retornando A,B e C
        //além desses, também compartilham metodos comuns no TreeSet também:
        /*
         *lower < Traz o imediatamente menor da coleção, por ex, ao usar no exemplo no mangá de Naruto Shippuden, o imediatamente menor é Solo leveling;
         *floor <= Traz o igual ou imediatamente menor da coleção;
         *higher > Traz o imediatamente maior da coleção;
         *celling >= Traz o maior ou imediatamente igual da coleçã
         */
    }
}
