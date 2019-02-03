package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {

    private HealthyStock healthyStock = new HealthyStock();

    @Override
    public boolean process(Product product) {
        if (healthyStock.stockHS().get(product.getName()) >= product.getQuantity()) {
            healthyStock.stockHS().remove(product.getName());
            healthyStock.stockHS().put(product.getName(), healthyStock.stockHS().get(product.getName()) - product.getQuantity());
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}