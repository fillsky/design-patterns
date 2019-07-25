package strategy.duck.quacking;

public class SquickQuacking implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("I'm squeak quacking!");
    }
}
