package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRetriever {

    public Order retrieve_1() {
        Customer customer = new Customer("Jacek", "Stamm");
        Integer quantity = 13;
        Product product = new Product("Chleb GF", quantity);
        String producer = "Gluten Free Shop";
        return new Order(customer, product, producer);
    }

    public Order retrieve_2() {
        Customer customer = new Customer("Jan", "Kowalski");
        Integer quantity = 70;
        Product product = new Product("Wafle kukurydziane", quantity);
        String producer = "Extra Food Shop";
        return new Order(customer, product, producer);
    }

    public Order retrieve_3() {
        Customer customer = new Customer("Miłosz", "Nowak");
        Integer quantity = 14;
        Product product = new Product("Makaron gryczany", quantity);
        String producer = "Healthy Shop";
        return new Order(customer, product, producer);
    }
}
