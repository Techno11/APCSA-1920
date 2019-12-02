package us.hartland.zaiser.soren.apcsa.Unit4;

import java.util.Scanner;

public class order {
    // To add a topping, add a topping string name to the toppingName. Then, add a double of the price to toppingPrice
    public static final String toppingName[] = {"Pineapple", "Pepperoni", "Mushroom", "Ham", "Just Cheese"};
    public static final double toppingPrice[] = {1.50,           1.50,        2.00,        1.50,   0.00};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0.0;
        price += runToppings(scan);
    }

    public static double runToppings(Scanner scan) {
        double totalSpentOnToppings = 0;
        // Print all toppings
        System.out.println("Toppings available:");
        for(int i = 0; i < toppingName.length; i++) {
            System.out.println(toppingName[i] + " +$" + toppingPrice[i]);
        }
        // Start loop to collect toppings
        while(true) {
            // Read from console
            String topping = getToppingFromConsole(scan);
            // If user entered none or done, we finish.
            if(topping.equals("done") || topping.equals("none")) {
                System.out.println("Your total spent on toppings is $" + totalSpentOnToppings);
                break; // Break out of loop
            }
            // Calculate price from topping name
            double price = toppingToPrice(topping);
            // Invalid topping entered
            if(price < 0){
                System.out.println("Invalid topping entered! Please try again.");
            } else {
                totalSpentOnToppings += price;
                System.out.println("You added " + topping + ".  This cost $" + price + ". You have now spent $" + totalSpentOnToppings);
            }
        }
        return 0;
    }

    public static String getToppingFromConsole(Scanner scan) {
        System.out.print("What toppings would you like? \nEnter \"Done\" when finished: ");
        String topping = scan.next();
        topping = topping.toLowerCase();
        return topping;
    }

    public static double toppingToPrice(String topping) {
        for(int i = 0; i < toppingName.length; i++) { // Go through our array of toppings and find ours. Once we do, return the price.
            if(toppingName[i].toLowerCase().equals(topping)) {
                return toppingPrice[i];
            }
        }
        //If we get here, topping entered is invalid!  Let's return negative value so we know it is wrong
        return -10;
    }
}
