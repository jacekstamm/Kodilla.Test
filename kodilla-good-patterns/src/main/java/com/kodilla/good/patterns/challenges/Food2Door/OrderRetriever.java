package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRetriever {

    public Order retrieve_1() {
        Customer customer = new Customer("Jacek", "Stamm");
        Product product = new Product("Chleb ciemny GF", 13);
        String producer = "Gluten Free Shop";
        return new Order(customer, product, producer);
    }

    public Order retrieve_2() {
        Customer customer = new Customer("Jan", "Kowalski");
        Product product = new Product("Wafle kukurydziane", 70);
        String producer = "Extra Food Shop";
        return new Order(customer, product, producer);
    }

    public Order retrieve_3() {
        Customer customer = new Customer("Miłosz", "Nowak");
        Product product = new Product("Makaron gryczany", 14);
        String producer = "Healthy Shop";
        return new Order(customer, product, producer);
    }
}
