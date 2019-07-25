package strategy.duck.flying;

public class NotFlying implements FlyingInterface {
    @Override
    public void fly() {
        System.out.println("Sorry, I can't fly ;(");
    }
}
