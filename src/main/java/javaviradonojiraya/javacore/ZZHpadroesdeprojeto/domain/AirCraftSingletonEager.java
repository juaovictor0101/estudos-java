package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonEager{
    // Eager initialization
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("Tuc tuc");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonEager getINSTANCE (){
        return INSTANCE;
    }

    public boolean bookSeat (String seat){
        return availableSeats.remove(seat);
    }
}

