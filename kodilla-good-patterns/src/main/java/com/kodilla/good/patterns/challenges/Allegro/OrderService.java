package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface OrderService {

    default boolean order(User user, LocalDate orderDate) {
        System.out.println("Create order for client: " + user + ". Date of order: " + orderDate + ".");
        return false;
    }
}
