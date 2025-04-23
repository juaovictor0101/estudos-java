package javaviradonojiraya.javacore.ZZHpadroesdeprojeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonLazy {
    private static AirCraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AirCraftSingletonLazy("Tuc Tuc");

                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}

