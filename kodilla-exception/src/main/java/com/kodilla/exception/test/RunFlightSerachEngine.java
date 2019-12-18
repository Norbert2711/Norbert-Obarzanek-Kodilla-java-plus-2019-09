package com.kodilla.exception.test;

public class RunFlightSerachEngine {
    public static void main(String[] args) {

        // obiekty klasy Flight - przykladowe polaczenia do sprawdzenia:
        Flight polandGermany = new Flight("POLAND", "GERMANY"); // F / T
        Flight spainBrazil = new Flight("SPAIN", "BRAZIL"); //  T / F
        Flight russiaBrazil = new Flight("RUSSIA", "BRAZIL");   // F / F
        Flight germanyEngland = new Flight("GERMANY", "ENGLAND");   // T / T

        flightSearchEngine flightSearcher = new flightSearchEngine();   //obiekt klasy flight...

        try {
            boolean connectionPolGer = flightSearcher.findFlight(polandGermany);
            System.out.println("Flight from Poland to Germany : " + connectionPolGer);
        } catch (RouteNotFoundException e) {
            System.out.println("No connection. please enter a valid name of airport. " + e + polandGermany);
        }

        try {
            boolean connectionSpaBra = flightSearcher.findFlight(spainBrazil);
            System.out.println("Flight from Spain to Brazil : " + connectionSpaBra);
        } catch (RouteNotFoundException e) {
            System.out.println("No connection. please enter a valid name of airport. " + e + spainBrazil);
        }
        try {
            boolean connectionRusBraz = flightSearcher.findFlight(russiaBrazil);
            System.out.println("Flight from Russia to Brazil : " + connectionRusBraz);
        } catch (RouteNotFoundException e) {
            System.out.println("No connection. please enter a valid name of airport. " + e + russiaBrazil);

        }
        try {
            boolean connectionGerEng = flightSearcher.findFlight(germanyEngland);
            System.out.println("Flight from Germany to England : " + connectionGerEng);
        } catch (RouteNotFoundException e) {
            System.out.println("No connection. please enter a valid name of airport. " + e + germanyEngland);
        }
    }
}