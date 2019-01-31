package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {

    private HealthyStock healthyStock = new HealthyStock();
    private int index;
    public int differenceQuantity;

    @Override
    public boolean process(Product product) {
        boolean isOrNot = false;
        for (int x = 0; x < healthyStock.stockHS().size(); x++) {
            if (healthyStock.stockHS().get(x).getProductName().equals(product.getProductName())){
                isOrNot = true;
                index = x;
                break;
            }
        }
        if (isOrNot && healthyStock.stockHS().get(index).getQuantity() >= product.getQuantity()) {
            differenceQuantity = healthyStock.stockHS().get(index).getQuantity() - product.getQuantity();
            String productName = healthyStock.stockHS().get(index).getProductName();
            healthyStock.stockHS().remove(index);
            healthyStock.stockHS().add(index, new Product(productName, differenceQuantity));
            System.out.println("Order is accepted.");
            return true;
        } else {
            System.out.println("Order false.");
            return false;
        }
    }
}
