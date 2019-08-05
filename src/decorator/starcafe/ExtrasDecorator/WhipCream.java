package decorator.starcafe.ExtrasDecorator;

import decorator.starcafe.Drink;

public class WhipCream  extends DrinkDecorator{

    private Drink drink;

    public WhipCream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+", bita śmietana";
    }

    @Override
    public float cost() {
        return drink.cost()+ 5f;
    }
}
