package com.kodilla.good.patterns.challenges.flightSystemV2;

import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class FlightFinder {

    public void availableFlights() {

        HashSet<Flight> flights = new HashSet<>();

        flights.add(new Flight("WARSAW", "NYC"));
        flights.add(new Flight("WARSAW", "WROCLAW"));
        flights.add(new Flight("WROCLAW", "WARSAW"));
        flights.add(new Flight("WROCLAW", "GDANSK"));
        flights.add(new Flight("KRAKOW", "NYC"));
        flights.add(new Flight("KRAKOW", "WARSAW"));
        flights.add(new Flight("NYC", "WARSAW"));
        flights.add(new Flight("NYC", "GDANSK"));
        flights.add(new Flight("GDANSK", "WROCLAW"));
        flights.add(new Flight("GDANSK", "KRAKOW"));
        flights.add(new Flight("GDANSK", "WARSAW"));

    }

    public List<Flight> flightsFrom(String city) {

        for (Flight flight : flightsFrom("GDANSK")) {

            if (flight.equals("GDANSK")) ;
        }
        return flightsFrom(city);
    }


    public List<Flight> flightsTo(String city) {

        for (Flight flight : flightsTo("NYC")) {
            if (flight.equals("NYC")) ;
        }
        return flightsTo(city);
    }

    public List<Flight> allFlights(String departure, String destination) {

        for (Flight from : flightsFrom("GDANSK")) {
            for (Flight to : flightsTo("NYC")) {
                if (from.getDepartureAirport().equals(to.getDestinationAirport()));
                System.out.println(" ......... ");
            }
        }
        return allFlights(departure, destination);
    }
}