package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.ArrayList;

public class Warszawa extends CitiesWithAirports {

    public Warszawa(String cityName, String departureAirport, String arrivalAirport) {
        super(cityName, departureAirport, arrivalAirport);
    }

    private ArrayList<CitiesWithAirports> flightFromTo = new ArrayList<>();
    private ArrayList<CitiesWithAirports> connectingWithChange = new ArrayList<>();

    public ArrayList<CitiesWithAirports> getFlightFromTo() {

        flightFromTo.add(new CitiesWithAirports("Warszawa", "WAR", "WRO"));
        flightFromTo.add(new CitiesWithAirports("Warszawa", "WAR", "KR"));
        flightFromTo.add(new CitiesWithAirports("Warszawa", "WAR", "GD"));

        return flightFromTo;
    }

    public ArrayList<CitiesWithAirports> connectingWithChange() {

        connectingWithChange.add(new CitiesWithAirports("Warszawa", "WAR",
                "WRO", "GD"));
        connectingWithChange.add(new CitiesWithAirports("Warszawa", "WAR",
                "GD", "KR"));
        connectingWithChange.add(new CitiesWithAirports("Warszawa", "WAR",
                "WRO", "KR"));
        return connectingWithChange;
    }
}