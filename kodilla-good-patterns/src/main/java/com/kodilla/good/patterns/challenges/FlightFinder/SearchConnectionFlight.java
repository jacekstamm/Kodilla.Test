package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchConnectionFlight {

    List<String> cities = new ArrayList<>();
    SearchFlightTo searchFlightTo = new SearchFlightTo();

    public List<String> connectionFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {

        List<String> arrival = searchFlightTo.ToFlightProcess(flightMap, flightOrder);

        for (Map.Entry<Integer, Flight> integerFlightEntry : flightMap.entrySet()) {
            for (String anArrival : arrival) {
                Flight e = integerFlightEntry.getValue();
                if (flightOrder.getDepartureCity().equals(e.getDepartureCity()) || flightOrder.getArrivalCity().equals(e.getArrivalCity())) {
                    if (e.getArrivalCity().equals(anArrival)) {
                        cities.add(e.getArrivalCity());
                    }
                }
            }
        }
        return cities;
    }
}
