package project;

public class Buyer {

    Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void makeOffer(){
        drink.makeDrink();
    }
}
