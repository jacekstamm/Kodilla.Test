package com.kodilla.good.patterns.challenges.Allegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User userJacekStamm = new User("Jacek", "Stamm");
        Item item = new Item("iPhone SE", 3999.98);

        return new OrderRequest(userJacekStamm, item);
    }
}
