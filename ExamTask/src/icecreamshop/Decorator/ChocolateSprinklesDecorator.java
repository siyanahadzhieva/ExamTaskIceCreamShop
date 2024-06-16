package icecreamshop.Decorator;

import icecreamshop.IceCream;

public class ChocolateSprinklesDecorator extends IceCreamDecorator {
    public ChocolateSprinklesDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void serve(String location) {
        decoratedIceCream.serve(location);
        System.out.println("Adding Chocolate Sprinkles");
    }
}
