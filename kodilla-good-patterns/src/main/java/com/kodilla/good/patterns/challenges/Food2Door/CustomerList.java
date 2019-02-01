package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class CustomerList {

    public ArrayList<Customer> customerListF2D() {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("Jacek", "Stamm"));
        list.add(new Customer("Janusz", "Kowalski"));
        list.add(new Customer("Dominik", "Rutkowski"));

        return list;
    }
}
