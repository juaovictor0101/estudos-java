package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.AirCraftSingletonEnum;

public class AirCraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");

    }

    private  static void bookSeat (String seat){
        System.out.println(AirCraftSingletonEnum.INSTANCE.hashCode());
        AirCraftSingletonEnum instance = AirCraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
