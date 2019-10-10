package us.hartland.zaiser.soren.apcsa.Unit3;

public class Pokemon {
    public static String pokeName = "Raichu";
    public static final int HP = 60;
    public static final int attack = 90;
    public static final int defense = 55;
    public static final int spAttack = 90;
    public static final int spDefense = 80;
    public static final int speed = 110;

    public static void main(String args[]) {
        System.out.println("The Pokemon you chose is " + pokeName + "!");
        System.out.println("Their base HP is " + HP + ". Their level 100 stat is " + calcLevel100Stat(HP));
        System.out.println("Their base attack is " + attack + ". Their level 100 stat is " + calcLevel100Stat(attack));
        System.out.println("Their base defence is " + defense + ". Their level 100 stat is " + calcLevel100Stat(defense));
        System.out.println("Their base special attack is " + spAttack + ". Their level 100 stat is " + calcLevel100Stat(spAttack));
        System.out.println("Their base special defense is " + spDefense + ". Their level 100 stat is " + calcLevel100Stat(spDefense));
        System.out.println("Their base speed is " + speed + ". Their level 100 stat is " + calcLevel100Stat(speed));
    }

    public static int calcLevel100Stat(int value) {
        return (value * 2) + 5;
    }
}
