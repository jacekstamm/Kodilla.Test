package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashMap;
import java.util.List;

public class FlightFinderMain {

    public static void main(String[] args) {

        Customer jacekStamm = new Customer("Jacek", "Stamm");
        Customer janKowalski = new Customer("Jan", "Kowalski");
        Customer zosiaSamosia = new Customer("Zosia", "Samosia");

        FlightOrder jacekStammOrder = new FlightOrder(jacekStamm, "Beijing", "");
        FlightOrder janKowalskiOrder = new FlightOrder(janKowalski, "", "Warsaw");
        FlightOrder zosiaSamosiaOrder = new FlightOrder(zosiaSamosia, "Beijing", "Warsaw");

        FlightMap flightMap = new FlightMap();
        HashMap<Integer, Flight> allFlightsMap = flightMap.listOfAllFlights();

        System.out.println("Order for " + jacekStamm + ". All flights FROM " + jacekStammOrder.getDepartureCity() + ": ");
        SearchFlightFrom searchFlightFrom = new SearchFlightFrom();
        List<String> jacekStammOrderResult = searchFlightFrom.FromFlightProcess(allFlightsMap, jacekStammOrder);
        System.out.println(jacekStammOrderResult);

        System.out.println("\n" + "Order for " + janKowalski + ". All flights TO " + janKowalskiOrder.getArrivalCity() + " are from:");
        SearchFlightTo searchFlightTo = new SearchFlightTo();
        List<String> janKowalskiOrderResult = searchFlightTo.ToFlightProcess(allFlightsMap, janKowalskiOrder);
        System.out.println(janKowalskiOrderResult);

        System.out.println("\n" + "Order for " + zosiaSamosia + ". Connecting flights from: " + zosiaSamosiaOrder.getDepartureCity() + " to: " + zosiaSamosiaOrder.getArrivalCity());
        SearchConnectionFlight searchConnectionFlight = new SearchConnectionFlight();
        List<String> zosiaSamosiaOrderResult = searchConnectionFlight.connectionFlightProcess(allFlightsMap, zosiaSamosiaOrder);
        System.out.println(zosiaSamosiaOrderResult);
    }
}