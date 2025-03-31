package javaviradonojiraya.javacore.ZZClambdas.Test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("João", "Victor", "Pedro");
        forEach(strings, (String s) -> System.out.println(s));
        List<Integer> inteiros = List.of(1,2,3,4,5);
        forEach(inteiros, (Integer i)-> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
