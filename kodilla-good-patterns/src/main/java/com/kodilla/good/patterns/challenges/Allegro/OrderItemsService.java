package com.kodilla.good.patterns.challenges.Allegro;

public class OrderItemsService implements OrderService {


    @Override
    public boolean order(Item item, User user) {
        System.out.println(user + " ordered " + item);
        return false;
    }
}
