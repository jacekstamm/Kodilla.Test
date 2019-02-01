package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {

    private ExtraFoodStock extraFoodStock = new ExtraFoodStock();

    @Override
    public boolean process(Product product) {
        if (extraFoodStock.stockEF().get(product.getName()) >= product.getQuantity()) {
            extraFoodStock.stockEF().remove(product.getName());
            extraFoodStock.stockEF().put(product.getName(), extraFoodStock.stockEF().get(product.getName()) - product.getQuantity());
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}