package pizzabillgenerator;

import java.util.Scanner;

public class PizzaOrderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = null;

        System.out.println("Welcome to Pizza Bill Generator!");
        System.out.println("Choose Pizza Type:");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        int choice = sc.nextInt();

        if (choice == 1) {
            pizza = new Pizza(true);
        } else {
            pizza = new Pizza(false);
        }

        System.out.println("Add Extra Cheese? (yes/no)");
        if (sc.next().equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.println("Add Extra Toppings? (yes/no)");
        if (sc.next().equalsIgnoreCase("yes")) {
            pizza.addExtraToppings();
        }

        System.out.println("Take Away? (yes/no)");
        if (sc.next().equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        pizza.getBill();
        sc.close();
    }
}
