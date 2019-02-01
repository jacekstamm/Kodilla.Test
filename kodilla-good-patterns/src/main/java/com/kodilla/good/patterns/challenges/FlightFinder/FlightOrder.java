package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightOrder {

    private final String departureCity;
    private final String arrivalCity;
    private final Customer customer;

    public FlightOrder(String departureCity, String arrivalCity, Customer customer) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.customer = customer;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public Customer getCustomer() {
        return customer;
    }
}
