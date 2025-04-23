package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.AirCraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private  static void bookSeat (String seat){
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getINSTANCE();
        System.out.println(airCraftSingletonEager.bookSeat(seat));
    }
}
