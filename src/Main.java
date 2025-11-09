import model.Meat;
import model.Apple;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных111
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        // Создание массива продуктов и корзины
        Food[] items = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(items);

        // Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPriceWithoutDiscount() + " руб.");
    }
}
