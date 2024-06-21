package org.example.rpg;

public class RpgMain {

    public static void main(String[] args) {
        Monster shrek = new Troll("shrek", 2000, 30);
        Monster wolf = new Werewolf("wolf", 500, 200);

        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack result of: " + monster.getName() + ": " + monster.attack());
    }
}
