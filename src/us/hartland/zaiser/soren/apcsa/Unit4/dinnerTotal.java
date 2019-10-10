package us.hartland.zaiser.soren.apcsa.Unit4;

import java.util.*;

public class dinnerTotal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many people ate dinner? ");
        int numPeople = s.nextInt();

        double subTotal = 0;
        for(int i = 0; i < numPeople; i++) {
            System.out.print("How much was person #" + (i + 1) + "'s meal cost? ");
            subTotal += s.nextDouble();
        }

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + (subTotal * .08) + " - 8%");
        System.out.println("Tip: " + (subTotal * .15) + " - 15%");
        System.out.println("Total: " + ((subTotal * .15) + (subTotal * .08) + subTotal));

    }
}
