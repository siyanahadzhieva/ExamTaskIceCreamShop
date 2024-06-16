package icecreamshop;

import icecreamshop.flavours.ChocolateIceCream;
import icecreamshop.flavours.StrawberryIceCream;
import icecreamshop.flavours.VanillaIceCream;

public class IceCreamFactory {
    public IceCream createIceCream(String flavor) {
        switch (flavor) {
            case "Vanilla":
                return new VanillaIceCream();
            case "Chocolate":
                return new ChocolateIceCream();
            case "Strawberry":
                return new StrawberryIceCream();
            default:
                throw new IllegalArgumentException("Unknown flavor: " + flavor);
        }
    }
}
