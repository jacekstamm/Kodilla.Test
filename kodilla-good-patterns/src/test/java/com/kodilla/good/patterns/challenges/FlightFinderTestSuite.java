package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.FlightFinder.*;
import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;
import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void testShouldFindCorrectAirport() {
        //Given
        Customer maciejKowalski = new Customer("Macej", "Kowalski");
        FlightOrder maciejKowalskiOrder = new FlightOrder(maciejKowalski, "London", "Dublin");
        FlightMap flightMap = new FlightMap();
        HashMap<Integer, Flight> allFlightsMap = flightMap.listOfAllFlights();
        //When
        SearchConnectionFlight searchConnectionFlight = new SearchConnectionFlight();
        List<String> cities = searchConnectionFlight.connectionFlightProcess(allFlightsMap, maciejKowalskiOrder);
        //Then
        Assert.assertEquals(2, cities.size());
        Assert.assertEquals("Warsaw", cities.get(0));
        Assert.assertEquals("Barcelona", cities.get(1));
    }
}
