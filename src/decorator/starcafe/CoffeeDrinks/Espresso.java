package decorator.starcafe.CoffeeDrinks;

import decorator.starcafe.Drink;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }


    @Override
    public float cost() {
        return 9.99f;
    }
}
