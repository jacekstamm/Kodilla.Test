package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {

    private Customer customer;
    private Product product;


    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }
}
