package us.hartland.zaiser.soren.apcsa.Unit3;

public class TestIfStatements {
    public static void main(String[] args) {
        boolean firstTest = false, secondTest = true, thirdTest = true;
        if(firstTest == true) {
            System.out.println("First Test Passed");
        } else if(secondTest == true) {
            System.out.println("First Test Failed, Second Test Passed!");
        } else {
            System.out.println("Both Tests Failed");
        }
        if(thirdTest) {
            System.out.println("Third Test Passed!");
        }
    }
}
