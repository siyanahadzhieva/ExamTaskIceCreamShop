package icecreamshop.flavours;

import icecreamshop.IceCream;

public class ChocolateIceCream extends IceCream {
    @Override
    public void serve(String location) {
        System.out.println("Serving Chocolate Ice Cream at " + location);
    }
}
