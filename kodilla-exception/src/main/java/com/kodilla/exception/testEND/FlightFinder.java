package com.kodilla.exception.testEND;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Poznan", false);
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", true);
        flightMap.put("Paris", false);
        flightMap.put("London", true);
        flightMap.put("Barcelona", false);

        if(flightMap.containsKey(flight.getDepartureAirport()) && flightMap.containsKey(flight.getArrivalAirport()) && ) {
            System.out.println("There is connection: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }



    }
}
