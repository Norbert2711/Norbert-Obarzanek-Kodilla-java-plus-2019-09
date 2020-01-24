package com.kodilla.good.patterns.challenges.flightSystemV2;

import java.util.HashSet;

public class Play {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        flightFinder.allFlights("GDANSK", "NYC");

    }
}
