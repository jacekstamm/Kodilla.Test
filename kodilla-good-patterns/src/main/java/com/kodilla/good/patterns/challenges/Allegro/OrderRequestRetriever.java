package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jacek", "Stamm");
        LocalDate orderDate = LocalDate.of(2019, 1, 22);

        return new OrderRequest(user, orderDate);
    }
}
