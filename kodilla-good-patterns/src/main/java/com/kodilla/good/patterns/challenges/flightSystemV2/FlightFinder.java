package com.kodilla.good.patterns.challenges.flightSystemV2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    private HashSet<Flight> flights = new HashSet<>();

    public HashSet<Flight> getFlights() {
        return flights;
    }

    public HashSet<Flight> availableFlights() {

        flights.add(new Flight("WARSAW", "WROCLAW"));
        flights.add(new Flight("WROCLAW", "WARSAW"));
        flights.add(new Flight("WROCLAW", "GDANSK"));
        flights.add(new Flight("KRAKOW", "WARSAW"));
        flights.add(new Flight("WARSAW", "NYC"));
        flights.add(new Flight("KRAKOW", "NYC"));
        flights.add(new Flight("NYC", "WARSAW"));
        flights.add(new Flight("NYC", "GDANSK"));
        flights.add(new Flight("GDANSK", "WROCLAW"));
        flights.add(new Flight("GDANSK", "KRAKOW"));
        flights.add(new Flight("GDANSK", "WARSAW"));
        return flights;
    }

public Set<Flight> flyFrom (String city){

    HashSet<Flight> flyFrom = new HashSet<>();

    for (Flight flight : flights) {
        if (flight.getDepartureAirport().equals("GDANSK")) {
            flyFrom.add(flight);
        }
    }

        return availableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());

}

    public Set<Flight> flightsTo (String city) {

        HashSet<Flight> flightsTo = new HashSet<>();

        for (Flight flight : flights){
            if (flight.getDestinationAirport().equals("NYC")) {
                flightsTo.add(flight);
            }
        }
        return availableFlights().stream()
                .filter(flight -> flight.getDestinationAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> allFlights(String departure, String destination) {

        HashSet<Flight> allFlights = new HashSet<>();

        for (Flight from : flyFrom("GDANSK")) {
            for (Flight to : flightsTo("NYC")) {

                List<Flight> connection = availableFlights().stream()
                        .filter(flight -> from.getDepartureAirport().equals(departure))
                        .filter(flight -> to.getDestinationAirport().equals(destination))
                        .collect(Collectors.toList());

                System.out.println(connection);

                if (connection.size() < 1) {
                    System.out.println("connection - true");
                }
                System.out.println("connection - false");
            }
            }

          return  allFlights;
    }
}