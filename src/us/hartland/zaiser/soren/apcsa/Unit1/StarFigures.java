package us.hartland.zaiser.soren.apcsa.Unit1;

public class StarFigures {

    public static void main(String[] args) {
        starX();
        System.out.println();
        starX();
        fiveStar();
        System.out.println();
        System.out.println("  *\n  *\n  *");
        starX();
    }

    public static void fiveStar() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void starX() {
        fiveStar();
        System.out.println(" * * ");
        System.out.println("  * ");
        System.out.println(" * * ");
    }
}
