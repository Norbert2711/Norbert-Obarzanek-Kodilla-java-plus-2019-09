package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    Country getPeopleQuantity(Country peopleQuantity) {
        return peopleQuantity;
    }
}
