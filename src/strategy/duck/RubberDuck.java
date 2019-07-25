package strategy.duck;


import strategy.duck.flying.NotFlying;
import strategy.duck.quacking.SquickQuacking;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new SquickQuacking(), new NotFlying());
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber Duck!");
    }


}
