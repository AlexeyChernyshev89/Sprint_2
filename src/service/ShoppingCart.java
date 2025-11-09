package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма товаров без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Общая сумма товаров со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemTotal = item.getAmount() * item.getPrice();
            double discount = item.getDiscount(); // Все объекты Food имеют этот метод
            itemTotal -= itemTotal * (discount / 100);
            total += itemTotal;
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