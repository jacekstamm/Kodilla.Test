package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface OrderRepository {

    default boolean create(User user, LocalDate orderDate) {
        return false;
    }
}
