package com.kodilla.good.patterns.challenges.flightSystemv3;

import com.kodilla.good.patterns.challenges.flightSystemv3.Flight2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder2 {

    private HashSet<Flight2> flights = new HashSet<>();

    public HashSet<Flight2> getFlights() {
        return flights;
    }

    public HashSet<Flight2> availableFlights() {

        flights.add(new Flight2("WARSAW", "WROCLAW"));
        flights.add(new Flight2("WROCLAW", "WARSAW"));
        flights.add(new Flight2("WROCLAW", "GDANSK"));
        flights.add(new Flight2("KRAKOW", "WARSAW"));
        flights.add(new Flight2("WARSAW", "NYC"));
        flights.add(new Flight2("KRAKOW", "NYC"));
        flights.add(new Flight2("NYC", "WARSAW"));
        flights.add(new Flight2("NYC", "GDANSK"));
        flights.add(new Flight2("GDANSK", "WROCLAW"));
        flights.add(new Flight2("GDANSK", "KRAKOW"));
        flights.add(new Flight2("GDANSK", "WARSAW"));
        return flights;
    }

    public Set<Flight2> flyFrom(String city) {

        return availableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());

    }

    public Set<Flight2> flightsTo(String city) {

        return availableFlights().stream()
                .filter(flight -> flight.getDestinationAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight2> allFlights(String departure, String destination) {

        HashSet<Flight2> allFlights = new HashSet<>();

        for (Flight2 from : flyFrom(departure)) {
            for (Flight2 to : flightsTo(destination)) {

                if(from.getDestinationAirport().equals(to.getDepartureAirport())){
                    allFlights.add(from);
                    allFlights.add(to);
                }
            }
        }

        return allFlights;
    }
}