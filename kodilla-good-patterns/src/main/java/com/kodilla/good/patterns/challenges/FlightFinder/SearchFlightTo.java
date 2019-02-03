package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class SearchFlightTo {

    public void ToFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> e.getArrivalCity().equals(flightOrder.getArrivalCity()))
                .forEach(System.out::println);
    }
}
