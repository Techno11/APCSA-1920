package us.hartland.zaiser.soren.apcsa.Unit1;

public class TwoRockets {
    public static void main(String[] args) {
        buildTriangle();
        buildSquare("      ", "      ");
        buildSquare("United", "States");
        buildSquare("      ", "      ");
        System.out.println("+------+ +------+");
        buildTriangle();
    }

    public static void buildSquare(String txtLine1, String txtLine2) {
        System.out.println(
                "+------+ +------+\n" +
                "|" + txtLine1 + "| |" + txtLine1 + "|\n" +
                "|" + txtLine2 + "| |" + txtLine2 + "|");
    }

    public static void buildTriangle() {
        System.out.println(
                "   /\\       /\\    \n" +
                "  /  \\     /  \\   \n" +
                " /    \\   /    \\ ");
    }
}
