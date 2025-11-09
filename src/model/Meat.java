package model;

public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    // Meat не переопределяет getDiscount(), использует базовую реализацию 0%
}