package com.kodilla.good.patterns.challenges.flightSystemv3;

import java.util.Set;

public class Play2 {
    public static void main(String[] args) {

        FlightFinder2 flightFinder = new FlightFinder2();

        Set<Flight2> flyWithChange = flightFinder.allFlights("GDANSK", "NYC");
        System.out.println(flyWithChange);
        System.out.println("fly from: ");
        Set<Flight2> flyFrom = flightFinder.flyFrom("GDANSK");
        System.out.println(flyFrom);

    }
}