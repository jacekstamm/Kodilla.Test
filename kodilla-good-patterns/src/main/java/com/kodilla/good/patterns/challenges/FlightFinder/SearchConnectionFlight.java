package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class SearchConnectionFlight {

    public void connectionFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> flightOrder.getDepartureCity().equals(e.getDepartureCity()) || flightOrder.getArrivalCity().equals(e.getArrivalCity()))
                .filter(e -> !e.getDepartureCity().equals(flightOrder.getDepartureCity()))
                .map(Flight::getDepartureCity)
                .forEach(System.out::println);
    }
}
