package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface OrderService {

    boolean order(User user, LocalDate orderDate);
}
