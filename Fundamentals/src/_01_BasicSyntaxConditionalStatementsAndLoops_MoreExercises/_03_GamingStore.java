package _01_BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double startingBalance = balance ;
        String game = scanner.nextLine();
        double gamePrice = 0;
        while (!game.equals("Game Time")){

            switch (game){
                case"RoverWatch Origins Edition":
                case"OutFall 4":
                    gamePrice = 39.99;
                    break;
                case"CS: OG":
                    gamePrice = 15.99;
                    break;
                case"Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case"Honored 2":
                    gamePrice = 59.99;
                    break;
                case"RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;

            }




            if (balance < gamePrice){
                System.out.println("Too Expensive");
                game = scanner.nextLine();
                continue;
            }

            System.out.println("Bought " + game);


            balance = balance - gamePrice;
            if(balance == 0){
                System.out.println("Out of money!" );
                return;
            }


            game = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",startingBalance-balance,balance);
    }
}
