package strategy.duck.quacking;

public class NormalQuacking implements QuackingInterface {
    @Override
    public void quack() {
        System.out.println("I'm just quacking, quack, quack!");
    }
}
