package icecreamshop.flavours;

import icecreamshop.IceCream;

public class VanillaIceCream extends IceCream {
    @Override
    public void serve(String location) {
        System.out.println("Serving Vanilla Ice Cream at " + location);
    }
}
