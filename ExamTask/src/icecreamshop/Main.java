package icecreamshop;

public class Main {
    public static void main(String[] args) {
        IceCreamShop shop = IceCreamShop.getInstance();

        shop.orderIceCream("Vanilla", "Chocolate Topping", "shop");
        shop.orderIceCream("Chocolate", "Chocolate Sprinkles", "park");
        shop.orderIceCream("Strawberry", null, "beach");
    }
}
