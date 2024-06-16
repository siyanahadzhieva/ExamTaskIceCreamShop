package icecreamshop.flavours;

import icecreamshop.IceCream;

public class StrawberryIceCream extends IceCream {
    @Override
    public void serve(String location) {
        System.out.println("Serving Strawberry Ice Cream at " + location);
    }
}
