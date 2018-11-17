package com.kodilla.exception.testEND;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {


        Map<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Poznan", false);
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", true);
        flightMap.put("Paris", false);
        flightMap.put("London", true);
        flightMap.put("Barcelona", false);
        flightMap.put("Madrit", true);
        flightMap.put("Moscow", false);

        boolean confirmationFlights = flightMap.containsKey(flight.getDepartureAirport()) && flightMap.containsKey(flight.getArrivalAirport());

        if(confirmationFlights) {
            System.out.println("There is connection: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }

        return confirmationFlights;

    }
}
