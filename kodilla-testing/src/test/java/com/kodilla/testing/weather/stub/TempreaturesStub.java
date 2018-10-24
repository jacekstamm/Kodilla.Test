package com.kodilla.testing.weather.stub;

import java.util.*;

public class TempreaturesStub implements Temperatures {

    @Override
    public HashMap<Integer, Double> getTempetures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        stubResult.put(0, 25.5);
        stubResult.put(1, 26.2);
        stubResult.put(2, 24.8);
        stubResult.put(3, 25.2);
        stubResult.put(4, 26.1);

        return stubResult;
    }
}
