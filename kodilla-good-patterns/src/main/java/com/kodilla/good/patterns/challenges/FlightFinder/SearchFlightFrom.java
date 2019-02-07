package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchFlightFrom {

    List<String> cities = new ArrayList<>();

    public List<String> FromFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> e.getDepartureCity().equals(flightOrder.getDepartureCity()))
                .map(Flight::getArrivalCity)
                .forEach(cities::add);

        return cities;
    }

    public List<String> getCities() {
        return cities;
    }
}
