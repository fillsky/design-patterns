package decorator.starcafe.CoffeeDrinks;

import decorator.starcafe.Drink;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        description = "Kawa Star Cafe Special";
    }

    @Override
    public float cost() {
        return 15f;
    }
}
