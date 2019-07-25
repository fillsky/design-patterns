package strategy.duck;

import strategy.duck.flying.FlyingInterface;
import strategy.duck.quacking.QuackingInterface;

public abstract class Duck {

    private QuackingInterface quaking;
    private FlyingInterface flying;

    public Duck(QuackingInterface quacking, FlyingInterface flying) {
        this.quaking = quacking;
        this.flying = flying;
    }

    public void makeQuacking() {
        quaking.quack();
    }

    public void makeFlying() {
        flying.fly();
    }

    public void swim() {
        System.out.println("Swimming!");
    }

    public abstract void display();

    protected void setQuaking(QuackingInterface newQuacking){
        quaking = newQuacking;
    }

    protected void setFlying(FlyingInterface newFlying){
        flying = newFlying;

    }


}
