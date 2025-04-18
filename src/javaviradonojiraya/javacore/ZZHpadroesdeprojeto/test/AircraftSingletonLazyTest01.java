package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.AirCraftSingletonEager;
import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.AirCraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        Constructor<AirCraftSingletonLazy> constructor = AirCraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructor.newInstance("Tuc Tuc");
        System.out.println(airCraftSingletonLazy);
    }

    private  static void bookSeat (String seat){
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonLazy airCraftSingletonLazy = AirCraftSingletonLazy.getINSTANCE();
        System.out.println(airCraftSingletonLazy.bookSeat(seat));
    }
}
