package icecreamshop.Decorator;

import icecreamshop.IceCream;

public class ChocolateToppingDecorator extends IceCreamDecorator {
    public ChocolateToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void serve(String location) {
        decoratedIceCream.serve(location);
        System.out.println("Adding Chocolate Topping");
    }
}
