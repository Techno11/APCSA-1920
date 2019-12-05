package us.hartland.zaiser.soren.apcsa.Unit10;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) arr.add(i);
        System.out.println("First print: " + arr);
        arr.add(10);
        System.out.println("Second print: " + arr);
        arr.set(2, 6);
        System.out.println("Third print: " + arr);
        arr.remove(5);
        System.out.println("Fourth print: " + arr);
    }
}
