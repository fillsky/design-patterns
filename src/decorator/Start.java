package decorator;

import decorator.starcafe.CoffeeDrinks.Espresso;
import decorator.starcafe.ExtrasDecorator.Chocolate;
import decorator.starcafe.ExtrasDecorator.WhipCream;

public class Start {
    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        WhipCream whipCreamEspresso = new WhipCream(espresso);
        Chocolate chocolateWhipCreamEspresso = new Chocolate(whipCreamEspresso);

        System.out.println(chocolateWhipCreamEspresso.getDescription()+chocolateWhipCreamEspresso.cost());
        System.out.println(espresso.cost()+espresso.getDescription());
        System.out.println(whipCreamEspresso.getDescription());

    }
}
