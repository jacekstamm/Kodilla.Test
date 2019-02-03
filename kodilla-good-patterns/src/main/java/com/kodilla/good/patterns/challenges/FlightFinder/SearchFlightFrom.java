package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class SearchFlightFrom {

    public void FromFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> e.getDepartureCity().equals(flightOrder.getDepartureCity()))
                .map(Flight::getArrivalCity)
                .forEach(System.out::println);

    }
}
