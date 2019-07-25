package strategy.duck.flying;

public class FlyingHaveWings implements FlyingInterface {
    @Override
    public void fly() {
        System.out.println("I'm Flying, thanks to that interface!");
    }
}
