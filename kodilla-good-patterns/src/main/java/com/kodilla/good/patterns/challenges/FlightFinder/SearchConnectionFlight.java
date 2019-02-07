package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.Map;

public class SearchConnectionFlight {

    public void connectionFlightProcess(HashMap<Integer, Flight> flightMap, FlightOrder flightOrder) {
        Flight orderFlight = new Flight(flightOrder.getDepartureCity(), flightOrder.getArrivalCity());
        flightMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .filter(e -> (flightOrder.getDepartureCity().equals(e.getDepartureCity()) || flightOrder.getArrivalCity().equals(e.getArrivalCity())) && !e.getDepartureCity().equals(flightOrder.getDepartureCity()))
                
                .forEach(System.out::println);

        System.out.println();

        for (Map.Entry<Integer, Flight> integerFlightEntry : flightMap.entrySet()) {
            Flight e = integerFlightEntry.getValue();
            if (flightOrder.getDepartureCity().equals(e.getDepartureCity()) || flightOrder.getArrivalCity().equals(e.getArrivalCity())) {
                if (!e.getDepartureCity().equals(flightOrder.getDepartureCity())) {
                    System.out.println(e);
                }
            }
        }

        System.out.println();

        for (int x = 0; x < flightMap.size(); x++) {
            Flight e = flightMap.get(x);
            if (flightOrder.getDepartureCity().equals(e.getDepartureCity()) || flightOrder.getArrivalCity().equals(e.getArrivalCity())) {
                if (!e.getDepartureCity().equals(flightOrder.getDepartureCity())) {
                    System.out.println(e);
                }
            }
        }
    }
}
