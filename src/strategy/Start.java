package strategy;

import strategy.duck.GamerDuck;


public class Start {

    public static void main(String[] args) {

        /*WildDuck wd = new WildDuck();
        wd.makeFlying();*/

        GamerDuck gamerDuck = new GamerDuck();
        gamerDuck.makeFlying();
        gamerDuck.makeQuacking();

        System.out.println("--- PAYING ---");
        gamerDuck.payForFlying();
        gamerDuck.payForQuacking();

        System.out.println("--- RESULT ---");
        gamerDuck.makeFlying();
        gamerDuck.makeQuacking();


    }
}
