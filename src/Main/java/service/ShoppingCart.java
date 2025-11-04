package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма товаров без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                double discount = discountable.getDiscount();
                double itemTotal = item.getAmount() * item.getPrice();
                total += itemTotal;
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    // Общая сумма товаров со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                total += item.getTotalPrice();
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    // Сумма вегетарианских продуктов без скидки
    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}