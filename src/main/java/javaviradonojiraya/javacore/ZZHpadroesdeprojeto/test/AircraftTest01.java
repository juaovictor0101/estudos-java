package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.test;

import javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain.AirCraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");;
        bookSeat("1A");;
    }

    private  static void bookSeat (String seat){
        AirCraft airCraft = new AirCraft("Boeng 777");
        System.out.println(airCraft.bookSeat(seat));
    }
}
