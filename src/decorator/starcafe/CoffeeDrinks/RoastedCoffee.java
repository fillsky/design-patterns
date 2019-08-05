package decorator.starcafe.CoffeeDrinks;

import decorator.starcafe.Drink;

public class RoastedCoffee extends Drink {

    public RoastedCoffee() {
        description = "Kawa Mocno Palona";
    }

    @Override
    public float cost() {
        return 10f;
    }
}
