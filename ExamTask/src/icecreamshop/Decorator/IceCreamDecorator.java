package icecreamshop.Decorator;

import icecreamshop.IceCream;

public abstract class IceCreamDecorator extends IceCream {
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.decoratedIceCream = iceCream;
    }

    @Override
    public void serve(String location) {
        decoratedIceCream.serve(location);
    }
}
