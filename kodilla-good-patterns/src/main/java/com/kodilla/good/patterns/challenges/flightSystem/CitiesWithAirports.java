package com.kodilla.good.patterns.challenges.flightSystem;

import java.util.Objects;

public class CitiesWithAirports {

    private String cityName;
    private String departureAirport;
    private String arrivalAirport;
    private String connectingWithChange;

    public CitiesWithAirports(String cityName, String departureAirport, String arrivalAirport) {
        this.cityName = cityName;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public CitiesWithAirports(String cityName, String departureAirport, String arrivalAirport, String connectingWithChange) {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getConnectingWithChange() {
        return connectingWithChange;
    }

    public void setConnectingWithChange(String connectingWithChange) {
        this.connectingWithChange = connectingWithChange;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "cityName='" + cityName + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesWithAirports cities = (CitiesWithAirports) o;
        return Objects.equals(connectingWithChange, cities.connectingWithChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectingWithChange);
    }
}
