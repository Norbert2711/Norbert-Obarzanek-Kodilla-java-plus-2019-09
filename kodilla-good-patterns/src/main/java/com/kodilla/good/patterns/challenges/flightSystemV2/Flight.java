package com.kodilla.good.patterns.challenges.flightSystemV2;

import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String destinationAirport;

    public Flight(String departureAirport, String destinationAirport) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, destinationAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                '}';
    }
}
