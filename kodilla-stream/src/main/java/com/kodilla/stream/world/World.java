package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    private List<Continent> listWithContinents = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listWithContinents.add(continent);
    }

    BigDecimal getPeopleQuantity() {
        return listWithContinents.stream()
                .flatMap(country -> country.getListWithCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

