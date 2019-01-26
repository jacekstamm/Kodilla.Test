package com.kodilla.good.patterns.challenges.Allegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User userJacekStamm = new User("Jacek", "Stamm");
        Item item = new Item("iPhone", 268.95);

        return new OrderRequest(userJacekStamm, item);
    }
}
