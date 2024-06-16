package icecreamshop;

import icecreamshop.Strategy.EatingLocationStrategy;

public class Customer {
    private EatingLocationStrategy eatingLocationStrategy;

    public void setEatingLocationStrategy(EatingLocationStrategy eatingLocationStrategy) {
        this.eatingLocationStrategy = eatingLocationStrategy;
    }

    public void eatIceCream() {
        eatingLocationStrategy.eat();
    }
}
