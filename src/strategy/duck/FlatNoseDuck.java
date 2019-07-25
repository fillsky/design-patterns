package strategy.duck;

import strategy.duck.flying.FlyingHaveWings;
import strategy.duck.quacking.NormalQuacking;


public class FlatNoseDuck extends Duck {
    public FlatNoseDuck() {
        super(new NormalQuacking(), new FlyingHaveWings());
    }

    @Override
    public void display() {
        System.out.println("I'm Flatnose Duck!");
    }
}
