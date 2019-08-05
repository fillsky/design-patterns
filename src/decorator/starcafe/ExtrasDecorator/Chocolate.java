package decorator.starcafe.ExtrasDecorator;

import decorator.starcafe.Drink;

public class Chocolate extends DrinkDecorator {

    private Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Czekolada";
    }

    @Override
    public float cost() {
        return drink.cost() + 3f;
    }
}
