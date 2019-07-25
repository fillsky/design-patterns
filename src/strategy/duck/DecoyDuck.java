package strategy.duck;

import strategy.duck.flying.NotFlying;
import strategy.duck.quacking.NotQuacking;


public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new NotQuacking(), new NotFlying());
    }

    @Override
    public void display() {
        System.out.println("I'm only a decoy!");
    }


}
