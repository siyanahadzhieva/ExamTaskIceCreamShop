package icecreamshop.Strategy;

public class EatOnBeachStrategy implements EatingLocationStrategy {
    @Override
    public void eat() {
        System.out.println("Eating on the beach.");
    }
}
