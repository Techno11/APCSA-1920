package us.hartland.zaiser.soren.apcsa.Unit2;

/**
 * Soren Zaiser
 * Programming Project 1
 */

public class progProject1 {

    public static void main(String[] args) {
        for(int i = 6; i >= 0; i--) {
            for(int j = i; j > 0; j--) System.out.print("*"); //Print Stars

            for(int j = -(i - 6); j >= 0; j--) System.out.print(" "); //Print Space

            for(int j = i * 2; j > 0; j--) System.out.print("/"); //Print /

            for(int j = -((i * 2) - 12); j > 0; j--) System.out.print("\\"); //Print \

            for(int j = -(i - 6); j >= 0; j--) System.out.print(" "); //Print Space

            for(int j = i; j > 0; j--) System.out.print("*"); //Print Stars

            System.out.println();
        }
    }
}
