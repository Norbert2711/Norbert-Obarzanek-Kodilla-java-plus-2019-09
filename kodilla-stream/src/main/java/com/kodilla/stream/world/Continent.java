package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> listWithCountries = new ArrayList<>();        //lista krajow
    private final String continentName;

    public Continent(String name) {
        this.continentName = name;
    }

    public String getContinentName() {
        return continentName;
    }

    public void Countries(List<Country> countries) {
        this.listWithCountries = countries;
    }

    List<Country> getListWithCountries(){
        return listWithCountries;
    }
    public void addCountry(Country country) {
        listWithCountries.add(country);
    }
}
