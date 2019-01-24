package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface OrderRepository {

    default boolean create(User user, LocalDate orderDate) {
        System.out.println("Saving order for: " + user + ". Date of order: " + orderDate + ".");
        return false;
    }
}
