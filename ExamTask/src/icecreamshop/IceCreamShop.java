package icecreamshop;

import icecreamshop.Decorator.ChocolateToppingDecorator;
import icecreamshop.Decorator.ChocolateSprinklesDecorator;

public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {
        // Private constructor to prevent instantiation
    }

    public static synchronized IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void orderIceCream(String flavor, String topping, String location) {
        IceCreamFactory factory = new IceCreamFactory();
        IceCream iceCream = factory.createIceCream(flavor);
        if (topping != null) {
            switch (topping) {
                case "Chocolate Topping":
                    iceCream = new ChocolateToppingDecorator(iceCream);
                    break;
                case "Chocolate Sprinkles":
                    iceCream = new ChocolateSprinklesDecorator(iceCream);
                    break;
            }
        }
        iceCream.serve(location);
    }
}
