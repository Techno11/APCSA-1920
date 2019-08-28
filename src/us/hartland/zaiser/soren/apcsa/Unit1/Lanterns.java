package us.hartland.zaiser.soren.apcsa.Unit1;

public class Lanterns {

    public static void main(String[] args) {
        lanternTop();
        System.out.println();
        lanternTop();
        lanternBottom();
        longLine();
        lanternTop();
        System.out.println();
        lanternTop();
        shortLine();
        lanternBottom();
        lanternBottom();
        shortLine();
        shortLine();
    }

    public static void lanternTop() {
        System.out.println(
                "    *****\n" +
                "  *********\n" +
                "*************");
    }

    public static void lanternBottom() {
        System.out.println("* | | | | | *");
    }

    public static void longLine() {
        System.out.println("*************");
    }

    public static void shortLine() {
        System.out.println("    *****");
    }
}
