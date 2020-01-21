package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.ArrayList;

public class Wroclaw extends CitiesWithAirports {

    public Wroclaw(String cityName, String departureAirport, String arrivalAirport) {
        super(cityName, departureAirport, arrivalAirport);
    }

    private ArrayList<CitiesWithAirports> flightFromTo = new ArrayList<>();
    private ArrayList<CitiesWithAirports> connectingWithChange = new ArrayList<>();

    public ArrayList<CitiesWithAirports> getFlightFromTo() {
        //bezposrednio
        flightFromTo.add(new CitiesWithAirports("Wroclaw", "WRO", "GD"));
        flightFromTo.add(new CitiesWithAirports("Wroclaw", "WRO", "WAR"));
        flightFromTo.add(new CitiesWithAirports("Wroclaw", "WRO", "KR"));
        return flightFromTo;
    }

    public ArrayList<CitiesWithAirports> connectingWithChange(){
        //mozliwe przesiadki
        connectingWithChange.add(new CitiesWithAirports("Wroclaw","WRO",
                "KR", "GD" ));
        connectingWithChange.add(new CitiesWithAirports("Wroclaw","WRO",
                "GD", "KR" ));
        connectingWithChange.add(new CitiesWithAirports("Wroclaw","WRO",
                "WAR", "KR" ));

        return connectingWithChange;
    }

}
