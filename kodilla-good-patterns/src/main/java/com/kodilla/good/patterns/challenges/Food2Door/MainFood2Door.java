package com.kodilla.good.patterns.challenges.Food2Door;

public class MainFood2Door {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order1 = orderRetriever.retrieve_1();
        Order order2 = orderRetriever.retrieve_2();
        Order order3 = orderRetriever.retrieve_3();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderProcess(order1);
        orderProcessor.orderProcess(order2);
        orderProcessor.orderProcess(order3);

    }
}
