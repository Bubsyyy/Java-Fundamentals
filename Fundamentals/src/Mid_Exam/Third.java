package Mid_Exam;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double totalWater = daysOfAdventure * players * water ;
        double totalFood = daysOfAdventure * players * food ;

        for(int day = 1 ; day <= daysOfAdventure ; day++){

            double energyLoss = Double.parseDouble(scanner.nextLine());
            groupEnergy-= energyLoss;

            if(groupEnergy <= 0){

                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
                return;
            }

            if (day % 2 == 0){

                groupEnergy = groupEnergy + groupEnergy * 0.05;
                totalWater = totalWater * 0.7 ;

            }

            if (day % 3 == 0){
                totalFood = totalFood - (totalFood/players) ;
                groupEnergy = groupEnergy + (groupEnergy * 0.1) ;
            }


        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);


    }
}
