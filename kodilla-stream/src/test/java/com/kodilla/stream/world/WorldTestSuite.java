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
        World world = new World();
        Continent continent = new Continent("Europe");
        continent.addCountry(new Country("Poland", new BigDecimal(48000000)));
        continent.addCountry(new Country("Germany", new BigDecimal(68000000)));
        continent.addCountry(new Country("Italy", new BigDecimal(40000000)));
        continent.addCountry(new Country("Czech Republic", new BigDecimal(120000000)));
        world.addContinent(continent);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeople = new BigDecimal(276000000);
        Assert.assertEquals(totalPeople, totalPeopleQuantity);
    }
}
