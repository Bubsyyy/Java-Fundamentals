package _02_DataTypesAndVariables;

import java.util.Scanner;

public class _10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1 ; currentNumber <= number ; currentNumber++ ){

            String currentNumberAsString = "" + currentNumber ;
            int numberLength = currentNumberAsString.length();

            int sumOfDigits = 0 ;

            for(int digit = 0 ; digit <= numberLength-1 ; digit++){
                char digitAsSymbol = currentNumberAsString.charAt(digit);
                int digitValue = Character.getNumericValue(digitAsSymbol);
                sumOfDigits += digitValue ;

            }

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11){
                System.out.printf("%d -> True\n",currentNumber);
            }else{
                System.out.printf("%d -> False\n",currentNumber);
            }

        }
    }
}
