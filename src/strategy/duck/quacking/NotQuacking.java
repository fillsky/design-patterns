package strategy.duck.quacking;

public class NotQuacking implements QuackingInterface {
    @Override
    public void quack() {
        System.out.println("Sorry, I can't quack");
    }
}
