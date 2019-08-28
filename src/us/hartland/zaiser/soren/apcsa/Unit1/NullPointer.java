package us.hartland.zaiser.soren.apcsa.Unit1;

/**
 * Soren Zaiser
 * I did this to prove a point
 * Java is very good about pointing you to the error
 */

import java.util.ArrayList;


public class NullPointer {

    public static void main(String[] args) {
        ArrayList<String> nullPointerArray = null;
        System.out.println(nullPointerArray.stream());
    }
}
