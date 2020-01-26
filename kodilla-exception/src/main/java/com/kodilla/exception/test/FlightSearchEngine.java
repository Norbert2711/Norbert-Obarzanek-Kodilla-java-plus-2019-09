package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    private final Map<String, Boolean> airportMap;

    public FlightSearchEngine() {           //konstruktor
        airportMap = allAirportsBase();
    }

    public Map<String, Boolean> getAirportMap() {
        return airportMap;
    }

    boolean findFlight(Flight flight) throws RouteNotFoundException { //wrzucenie wyjatku
        return findAirportName(flight.getArrivalAirport()) &&
                findAirportName(flight.getDepartureAirport());
    }

    private boolean findAirportName(String airsNames) throws RouteNotFoundException {
        //wrzucenei wyjatku z klasy "RouteNot..."
        if (allAirportsBase().containsKey(airsNames)) {
            //sprawdzenie czy istnieje lotnisko o takiej nazwie w mapie lotnisk (po nazwie lotska)
            return airportMap.get(airsNames);   //zwrocenie lotniska
        } else {      //"""WYJATEK", jesli nie mozna ladowac na lotnisku(false) to wyswietl wiadomosc:
            throw new RouteNotFoundException("An airport with this name does not exist. Cannot unload!");
        }

    }

    private Map<String, Boolean> allAirportsBase() {   //zwracana baza z nazwami (mapa) lotnisk i ich dostepnoscia.
        Map<String, Boolean> allAirports = new HashMap<String, Boolean>();
        allAirports.put("ENGLAND", true);
        allAirports.put("POLAND", false);
        allAirports.put("GERMANY", true);
        allAirports.put("SPAIN", true);
        allAirports.put("BRAZIL", false);
        allAirports.put("RUSSIA", false);
        return allAirports;
    }

}
