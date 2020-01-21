package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.ArrayList;

public class Gdansk extends CitiesWithAirports {

    public Gdansk(String cityName, String departureAirport, String arrivalAirport) {
        super(cityName, departureAirport, arrivalAirport);
    }

    private ArrayList<CitiesWithAirports> flightFromTo = new ArrayList<>();
    private ArrayList<CitiesWithAirports> connectingWithChange = new ArrayList<>();

    public ArrayList<CitiesWithAirports> getFlightFromTo() {
        flightFromTo.add(new CitiesWithAirports("Gdańsk", "GD", "WRO"));
        flightFromTo.add(new CitiesWithAirports("Gdańsk", "GD", "WAR"));
        flightFromTo.add(new CitiesWithAirports("Gdańsk", "GD", "KR"));
        return flightFromTo;
    }

    public ArrayList<CitiesWithAirports> connectingWithChange() {
        connectingWithChange.add(new CitiesWithAirports("Gdańsk", "GD",
                "KR", "WRO"));
        connectingWithChange.add(new CitiesWithAirports("Gdańsk", "GD",
                "WAR", "KR"));
        connectingWithChange.add(new CitiesWithAirports("Gdańsk", "GD",
                "WRO", "WAR"));

        return connectingWithChange;
    }
}