package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    private List<Continent> continents = new ArrayList<>();
    private BigDecimal peopleQuantity;

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public World(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }

    public List<Continent> getContinents() {
        return continents;
    }


}

