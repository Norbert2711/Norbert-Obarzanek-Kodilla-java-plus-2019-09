package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Continent> continents = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
        World world = new World(continents);
        countries.add(new Country("Poland", new BigDecimal(48000000)));
        countries.add(new Country("Germany", new BigDecimal(68000000)));
        countries.add(new Country("Italy", new BigDecimal(40000000)));
        countries.add(new Country("Czech Republic", new BigDecimal(12000000)));
        continents.add(new Continent(countries, "Europe"));
        world.setContinents(continents);

        //When
////        BigDecimal totalPeopleQuantity = world.getContinents().stream()
////                .flatMap(country -> country.getCountries().stream())
////                .map(Country::getPeopleQuantity)
////                .reduce(BigDecimal.ZERO,  World(world.getPeopleQuantity()));
//
//        //Then
//        BigDecimal totalPeople = new BigDecimal(336000000);
//        Assert.assertEquals(totalPeople, totalPeopleQuantity);
    }
}
