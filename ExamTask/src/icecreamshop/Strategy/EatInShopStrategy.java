package icecreamshop.Strategy;

public class EatInShopStrategy implements EatingLocationStrategy {
    @Override
    public void eat() {
        System.out.println("Eating in the shop.");
    }
}
