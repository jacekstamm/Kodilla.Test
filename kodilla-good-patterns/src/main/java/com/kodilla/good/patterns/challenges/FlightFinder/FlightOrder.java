package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightOrder {

    private final Customer customer;
    private final String departureCity;
    private final String arrivalCity;


    public FlightOrder(Customer customer, String departureCity, String arrivalCity) {
        this.customer = customer;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;

    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }


}
