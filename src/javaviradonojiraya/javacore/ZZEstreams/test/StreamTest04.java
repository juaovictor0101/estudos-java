package javaviradonojiraya.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> empresaTeste = new ArrayList<>();
        List<String> gerentes = List.of("José", "Maria", "Jonas","Juliana");
        List<String> supervisores = List.of("João", "Pedro", "Samila", "Vitoria");
        List<String> funcionarios = List.of("Marcos", "Rafael", "Mateus");

        empresaTeste.add(gerentes);
        empresaTeste.add(supervisores);
        empresaTeste.add(funcionarios);

        //como visto no test02 dessa modulo, para ter acesso a um elemento específico de uma lista, pode-se usar o .map,
        // mas em situações que as informação estão aninhadas, isso acaba ficando um pouco complicado usar o .map, nesses
        // casos podemos usar o .flatMap

        //sem usar streams, para printar todos os nomes ficaria assim:

        for (List<String> people : empresaTeste) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        //usando flatMap:

        System.out.println("---");
        empresaTeste.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
