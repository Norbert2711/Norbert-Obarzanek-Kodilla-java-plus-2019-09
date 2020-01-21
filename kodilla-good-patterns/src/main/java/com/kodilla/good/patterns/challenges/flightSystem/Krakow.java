package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.ArrayList;

public class Krakow extends CitiesWithAirports {

    public Krakow(String cityName, String departureAirport, String arrivalAirport, String connectingWithChange) {
        super(cityName, departureAirport, arrivalAirport, connectingWithChange);
    }

    private ArrayList<CitiesWithAirports> flightFromTo = new ArrayList<>();
    private ArrayList<CitiesWithAirports> connectingWithChange = new ArrayList<>();

    public ArrayList<CitiesWithAirports> getFlightFromTo() {

        flightFromTo.add(new CitiesWithAirports("Krakow", "KR", "WRO"));
        flightFromTo.add(new CitiesWithAirports("Krakow", "KR", "GD"));
        flightFromTo.add(new CitiesWithAirports("Krakow", "KR", "WAR"));

        return flightFromTo;
}
    public ArrayList<CitiesWithAirports> connectingWithChange(){

        connectingWithChange.add(new CitiesWithAirports("Krakow","KR","WRO",
                "WAR" ));
        connectingWithChange.add(new CitiesWithAirports("Krakow","KR","WAR",
                "GD" ));
        connectingWithChange.add(new CitiesWithAirports("Krakow","KR","GD",
                "WAR" ));

        return connectingWithChange;
    }

}
