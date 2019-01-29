package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRetriever {

    public Order retrieve() {
        Customer customer = new Customer("Jacek", "Stamm");
        Product product = new Product("Orzechy laskowe", 78);

        return new Order(customer, product);
    }
}
