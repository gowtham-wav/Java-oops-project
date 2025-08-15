package pizzabillgenerator;

public class Pizza {
    private int price;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int takeAwayPrice = 20;

    public Pizza(boolean veg) {
        if (veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isTakeAway = true;
        this.price += takeAwayPrice;
    }

    public void getBill() {
        System.out.println("Base Price: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            System.out.println("Extra Cheese: " + extraCheesePrice);
        }
        if (isExtraToppingsAdded) {
            System.out.println("Extra Toppings: " + extraToppingsPrice);
        }
        if (isTakeAway) {
            System.out.println("Take Away: " + takeAwayPrice);
        }
        System.out.println("Total Price: " + this.price);
    }
}
