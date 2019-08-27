package us.hartland.zaiser.soren.apcsa.Unit1;

import java.util.ArrayList;

public class NullPointer {

    public static void main(String[] args) {
        ArrayList<String> nullPointerArray = null;
        System.out.println(nullPointerArray.stream());
    }
}
