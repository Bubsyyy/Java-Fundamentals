package _02_DataTypesAndVariables_Exercises;
import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());
        double highestSnowballValue = 0;
        int highestSnowballSnow = 0 ;
        int highestSnowballTime = 0 ;
        int highestSnowballQuality = 0 ;


        for(int currentSnowball = 1 ; currentSnowball <= snowballs ; currentSnowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);


            if(snowballValue > highestSnowballValue ){
                highestSnowballValue = snowballValue ;
                highestSnowballSnow = snowballSnow ;
                highestSnowballTime = snowballTime ;
                highestSnowballQuality = snowballQuality ;
            }


        }

        System.out.printf("%d : %d = %.0f (%d)",highestSnowballSnow,highestSnowballTime,highestSnowballValue,highestSnowballQuality);


    }
}