package decorator.starcafe;

public abstract class Drink {

    protected String description = "Nieznany Napój";


    public abstract float cost();

    public String getDescription() {
        return description;
    }


}
