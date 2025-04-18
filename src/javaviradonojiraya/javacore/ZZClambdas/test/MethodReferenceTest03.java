package javaviradonojiraya.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to an instance method of arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>(List.of("João", "Maria", "Jose","Ana","Bruno"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger= Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName= List::contains;
        System.out.println(checkName.test(list, "Ana"));
    }
}
