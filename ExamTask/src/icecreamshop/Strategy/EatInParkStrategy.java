package icecreamshop.Strategy;

public class EatInParkStrategy implements EatingLocationStrategy {
    @Override
    public void eat() {
        System.out.println("Eating in the park.");
    }
}
