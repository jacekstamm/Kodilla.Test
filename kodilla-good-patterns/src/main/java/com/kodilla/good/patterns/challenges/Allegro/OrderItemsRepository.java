package com.kodilla.good.patterns.challenges.Allegro;

public class OrderItemsRepository implements OrderRepository {

    @Override
    public boolean create(Item item, User user) {
        System.out.println("Creating new order in data base. User " + user + "ordered item: " + item + ".");
        return false;
    }
}
