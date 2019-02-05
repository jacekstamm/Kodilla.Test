package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;

public class FlightMap {

    public HashMap<Integer, Flight> listOfAllFlights() {
        HashMap<Integer, Flight> listOfFlights = new HashMap<>();
        listOfFlights.put(0, new Flight("London", "Manchester"));
        listOfFlights.put(1, new Flight("Beijing", "Shanghai"));
        listOfFlights.put(2, new Flight("London", "Warsaw"));
        listOfFlights.put(3, new Flight("Warsaw", "Dublin"));
        listOfFlights.put(4, new Flight("Beijing", "Dubai"));
        listOfFlights.put(5, new Flight("London", "Barcelona"));
        listOfFlights.put(6, new Flight("Warsaw", "Beijing"));
        listOfFlights.put(7, new Flight("Dublin", "Beijing"));
        listOfFlights.put(8, new Flight("Dubai", "Warsaw"));
        listOfFlights.put(9, new Flight("Warsaw", "Barcelona"));
        listOfFlights.put(10, new Flight("Barcelona", "Dublin"));

        return listOfFlights;
    }
}
