package com.kodilla.good.patterns.challenges.flightSystemV2;

import java.util.HashSet;
import java.util.List;

public class FlightFinder {

    public HashSet<Flight> availableFlights() {

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
        return flights;
    }

    public List<Flight> flightsFrom(String city) {

        HashSet<HashSet<Flight>> flyFrom = new HashSet<>();

        for (HashSet<Flight> flight : flyFrom) {
            if (availableFlights().equals("GDANSK")) {
                flyFrom.add(flight);
            }
        }
        return flightsFrom(city);
    }

    public List<Flight> flightsTo(String city) {

        HashSet<Flight> flightsTo = new HashSet<>();

        for (Flight flight : flightsTo){
            if (availableFlights().equals("NYC")) {
                flightsTo.add(flight);
            }
        }
        return flightsTo(city);
    }

    public List<Flight> allFlights(String departure, String destination) {

        for (Flight from : flightsFrom("GDANSK")) {
            for (Flight to : flightsTo("NYC")) {
                if (from.getDepartureAirport().equals(to.getDestinationAirport())) {
                    System.out.println("connection - true");
                }
                System.out.println("connection - false");
            }
        }
        return allFlights(departure, destination);
    }
}