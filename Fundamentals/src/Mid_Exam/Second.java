package Mid_Exam;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carsData = scanner.nextLine().split(">>");
        int sumOfTaxes = 0 ;

        for (int currentIndex = 0 ;currentIndex < carsData.length ; currentIndex++){

            String[] currentDetails = carsData[currentIndex].split(" ");
            String car = currentDetails[0];
            int year = Integer.parseInt(currentDetails[1]);
            int kilometers = Integer.parseInt(currentDetails[2]);

            if(car.equals("family")){
                int tax = (kilometers / 3000) * 12 + (50 - year * 5) ;
                double formattedTax = (double)tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n",car,formattedTax);
                sumOfTaxes += tax;

            } else if (car.equals("heavyDuty")) {

                int tax = (kilometers / 9000) * 14 + (80 - year * 8) ;
                double formattedTax = (double)tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n",car,formattedTax);
                sumOfTaxes += tax;

            } else if (car.equals("sports")) {

                int tax = (kilometers / 2000) * 18 + (100 - year * 9) ;
                double formattedTax = (double)tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n",car,formattedTax);
                sumOfTaxes += tax;

            }else{
                System.out.println("Invalid car type.");
                continue;
            }


        }

        double formatedSum = (double)sumOfTaxes;
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",formatedSum );
    }
}
