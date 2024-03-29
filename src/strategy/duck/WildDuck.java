package strategy.duck;

import strategy.duck.flying.FlyingHaveWings;
import strategy.duck.quacking.NormalQuacking;


public class WildDuck extends Duck {
    public WildDuck() {
        super(new NormalQuacking(), new FlyingHaveWings());
    }

    @Override
    public void display() {
        System.out.println("I'm Wild Duck!");
    }
}
