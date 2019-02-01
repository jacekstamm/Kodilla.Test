package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRetriever {

    private CustomerList customerList = new CustomerList();

    public Order orderFromGlutenFreeShop() {
        Product product = new Product("Chleb GF", 13);
        String producer = "Gluten Free Shop";
        return new Order(customerList.customerListF2D().get(0), product, producer);
    }

    public Order orderFromExtraFoodShop() {
        Product product = new Product("Wafle kukurydziane", 260);
        String producer = "Extra Food Shop";
        return new Order(customerList.customerListF2D().get(1), product, producer);
    }

    public Order orderHealthyShop() {
        Product product = new Product("Makaron gryczany", 14);
        String producer = "Healthy Shop";
        return new Order(customerList.customerListF2D().get(2), product, producer);
    }
}