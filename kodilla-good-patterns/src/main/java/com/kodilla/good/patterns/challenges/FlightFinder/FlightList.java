package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;

public class FlightList {

    public ArrayList<Flight> listOfAllFlights() {
        ArrayList<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("London", "Manchester"));
        listOfFlights.add(new Flight("Beijing", "Shanghai"));
        listOfFlights.add(new Flight("Warsaw", "Dublin"));
        listOfFlights.add(new Flight("London", "Warsaw"));

        return listOfFlights;
    }
}
