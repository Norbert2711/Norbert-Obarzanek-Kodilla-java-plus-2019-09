package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        stubResult.put(0, 12.1);
        stubResult.put(6, 23.5);
        stubResult.put(5, 16.2);
        stubResult.put(1, 18.3);
        stubResult.put(8, 25.6);

        return stubResult;
    }
}
