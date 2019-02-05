package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.FlightFinder.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class FlightFinderTestSuite {

    @Test
    public void testShouldFindCorrectAirport() {
        //Given
        Customer maciejKowalski = new Customer("Macej", "Kowalski");
        FlightOrder maciejKowalskiOrder = new FlightOrder(maciejKowalski, "Beijing", "Warsaw");
        FlightMap flightMap = new FlightMap();
        HashMap<Integer, Flight> allFlightsMap = flightMap.listOfAllFlights();
        //When
        SearchConnectionFlight searchConnectionFlight = new SearchConnectionFlight();
        searchConnectionFlight.connectionFlightProcess(allFlightsMap, maciejKowalskiOrder);
        //Then

    }
}
