package decorator.starcafe.CoffeeDrinks;

import decorator.starcafe.Drink;

public class NonCaffeineCoffee extends Drink {

    public NonCaffeineCoffee() {
        description = " Kawa Bezkofeinowa";
    }

    @Override
    public float cost() {
        return 25f;
    }
}
