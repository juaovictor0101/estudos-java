package javaviradonojiraya.javacore.ZZClambdas.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Naruto", "Dragon Ball");
        List<Integer> integers = map(strings, (String s) -> s.length());
        List<String> map = map(strings, s->s.toUpperCase());
        System.out.println(map);
        System.out.println(integers);
    }
    private static <T, R>List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
