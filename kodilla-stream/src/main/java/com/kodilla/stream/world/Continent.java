package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> countries = new ArrayList<>();        //lista krajow
    private final String name;

    public Continent(List<Country> countries, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Countries(List<Country> countries) {
        this.countries = countries;
    }

    List<Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }
}
