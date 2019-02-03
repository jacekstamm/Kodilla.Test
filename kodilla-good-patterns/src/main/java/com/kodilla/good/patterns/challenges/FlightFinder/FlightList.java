package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;

public class FlightList {

    public ArrayList<Flight> listOfAllFlights() {
        ArrayList<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("London", "Manchester"));
        listOfFlights.add(new Flight("Beijing", "Shanghai"));
        listOfFlights.add(new Flight("Warsaw", "Dublin"));
        listOfFlights.add(new Flight("London", "Warsaw"));
        listOfFlights.add(new Flight("Beijing", "Dubai"));
        listOfFlights.add(new Flight("Warsaw", "Beijing"));
        listOfFlights.add(new Flight("Dublin", "Beijing"));
        listOfFlights.add(new Flight("Dubai", "Warsaw"));
        listOfFlights.add(new Flight("Warsaw", "Barcelona"));
        listOfFlights.add(new Flight("Barcelona", "Dublin"));
        listOfFlights.add(new Flight("London", "Barcelona"));

        return listOfFlights;
    }
}
