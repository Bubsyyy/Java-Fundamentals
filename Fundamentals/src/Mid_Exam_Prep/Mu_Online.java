package Mid_Exam_Prep;

import java.util.Scanner;

public class Mu_Online {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int coins = 0;
        int roomsCount = 0;

        for (String room : rooms) {

            //"cat 10"
            String name = room.split(" ")[0];
            int amount = Integer.parseInt(room.split(" ")[1]);
            roomsCount++;

            switch (name) {
                case "potion":
                    health = Healing(health,amount);
                    break;
                case "chest":
                    coins = GettingCoins(coins,amount);
                    break;
                default:
                    health = Battle(health,amount,roomsCount,name);
                    break;
            }
        }

        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + coins);
        System.out.println("Health: " + health);
    }
    private static int Healing(int health, int amount){
        int healAmount = Math.min(100 - health, amount);
        health += healAmount;
        System.out.printf("You healed for %d hp.\n", healAmount);
        System.out.printf("Current health: %d hp.\n", health);
        return health;
    }

    private static int GettingCoins(int coins , int amount){
        coins += amount;
        System.out.printf("You found %d bitcoins.\n", amount);
        return coins;
    }

    private static int Battle(int health , int amount , int roomsCount , String name){
        health -= amount;
        if (health > 0) {
            System.out.printf("You slayed %s.\n", name);
            return health ;

        } else {
            System.out.printf("You died! Killed by %s.\n", name);
            System.out.printf("Best room: %d", roomsCount);
            System.exit(0);
        }


        return health;
    }
}
