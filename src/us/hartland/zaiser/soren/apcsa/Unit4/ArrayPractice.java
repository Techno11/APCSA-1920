package us.hartland.zaiser.soren.apcsa.Unit4;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayPractice {


    public static void main(String[] args) {
        int[] practice = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(practice));
        practice[2] = 6;
        System.out.println(Arrays.toString(practice));

        int[] reversed = reverse(practice);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        int totalSixes = countNum(reversed, 6);
        System.out.println("Number of 6s in the array: " + totalSixes);
    }

    public static int[] reverse(int[] a) {
        int[] newA = new int[a.length];
        int reverseI = a.length - 1;
        for(int i = 0; i < a.length; i++) {
            newA[reverseI] = a[i];
            reverseI--;
        }
        return newA;
    }

    public static int countNum(int[] a, int numToCount) {
        int total = 0;
        for(int num: a) if(num == numToCount) total++;
        return total;
    }
}
