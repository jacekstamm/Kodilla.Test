package com.kodilla.exception.testEND;

public class FlightFinderRunner {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Poznan", "Paris"));
        } catch (RouteNotFoundException e) {
            System.out.println("There is no connection between these airports! Please change destinations.");
        }
    }
}
