package us.hartland.zaiser.soren.apcsa.Unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testFIle {
    public static void main(String []args){
        int[] one = {10, 20, 30};
        int[] two ={8, 2, 9, 7, 4};
        int[] three = {-1, 3, 28, 17, 9, 33};

        mystery4(convertIntArrayToList(one));
        System.out.println();
        mystery4(convertIntArrayToList(two));
        System.out.println();
        mystery4(convertIntArrayToList(three));
    }

    public static void mystery4(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    private static ArrayList<Integer> convertIntArrayToList(int[] input) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : input) {
            list.add(i);
        }
        return list;

    }
}
