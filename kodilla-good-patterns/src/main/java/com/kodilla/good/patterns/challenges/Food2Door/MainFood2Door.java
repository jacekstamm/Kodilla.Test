package com.kodilla.good.patterns.challenges.Food2Door;

public class MainFood2Door {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order orderWafle = orderRetriever.orderFromExtraFoodShop();
        Order orderChleb = orderRetriever.orderFromGlutenFreeShop();
        Order orderMakaron = orderRetriever.orderHealthyShop();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.orderProcess(orderWafle);
        orderProcessor.orderProcess(orderChleb);
        orderProcessor.orderProcess(orderMakaron);
    }
}
