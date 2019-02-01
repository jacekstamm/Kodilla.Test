package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Shop {

    private GlutenFreeStock glutenFreeStock = new GlutenFreeStock();

    @Override
    public boolean process(Product product) {
        if (glutenFreeStock.stockGF().get(product.getName()) >= product.getQuantity()) {
            glutenFreeStock.stockGF().remove(product.getName());
            glutenFreeStock.stockGF().put(product.getName(), glutenFreeStock.stockGF().get(product.getName()) - product.getQuantity());
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}