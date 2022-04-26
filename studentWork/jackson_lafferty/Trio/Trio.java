package Trio;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice() {
        if (drink.getPrice() > salad.getPrice() && sandwich.getPrice() > salad.getPrice()) {
            return drink.getPrice() + sandwich.getPrice();
        }

        if (salad.getPrice() > drink.getPrice() && sandwich.getPrice() > drink.getPrice()) {
            return salad.getPrice() + sandwich.getPrice();
        }

        if (salad.getPrice() == drink.getPrice() && sandwich.getPrice() > salad.getPrice()) {
            return salad.getPrice() + sandwich.getPrice();
        }

        return salad.getPrice() + drink.getPrice();
    }
}
