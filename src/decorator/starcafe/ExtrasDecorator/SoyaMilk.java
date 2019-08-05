package decorator.starcafe.ExtrasDecorator;

import decorator.starcafe.Drink;

public class SoyaMilk extends DrinkDecorator {

    Drink drink;

    public SoyaMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", mleko sojowe";
    }

    @Override
    public float cost() {
        return drink.cost() + 1.5f;
    }
}
