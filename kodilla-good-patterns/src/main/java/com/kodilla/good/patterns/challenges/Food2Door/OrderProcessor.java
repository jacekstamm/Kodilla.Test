package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class OrderProcessor {

    private Food2DoorProducerList producerList = new Food2DoorProducerList();

    public boolean orderProcess(Order order) {
        Shop shop = producerList.getF2DProducerList().get(order.getProducer().toUpperCase());
        boolean orderInProgress = shop.process(order.getProduct());

        for (HashMap.Entry<String, Shop> entry : producerList.getF2DProducerList().entrySet()) {
            if(entry.getKey().equals(order.getProducer().toUpperCase())) {
                break;
            }
        }
        return orderInProgress;
    }
}