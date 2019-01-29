package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {

    private Customer customer;
    private Product product;
    private String producer;


    public Order(Customer customer, Product product, String producer) {
        this.customer = customer;
        this.product = product;
        this.producer = producer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public String getProducer() {
        return producer;
    }
}
