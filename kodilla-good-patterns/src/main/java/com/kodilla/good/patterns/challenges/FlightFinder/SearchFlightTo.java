package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class SearchFlightTo {

    List<String> cities = new ArrayList<>();

    public List<String> ToFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> e.getArrivalCity().equals(flightOrder.getArrivalCity()))
                .map(Flight::getDepartureCity)
                .forEach(cities::add);

        return cities;
    }

    public List<String> getCities() {
        return cities;
    }
}
