package strategy.duck;


import strategy.duck.flying.FlyingHaveWings;
import strategy.duck.flying.NotFlying;
import strategy.duck.quacking.NormalQuacking;
import strategy.duck.quacking.NotQuacking;



public class GamerDuck extends Duck {

    public GamerDuck() {
        super(new NotQuacking(), new NotFlying());
    }

    @Override
    public void display() {
        System.out.println("A Gaming Duck, just showed up!");
    }

    public void payForFlying() {
        System.out.println("You paid 5$, your duck can fly now");
        setFlying(new FlyingHaveWings());
    }

    public void payForQuacking() {
        System.out.println("You paid 10$, your duck can quack now");
        setQuaking(new NormalQuacking());
    }


}
