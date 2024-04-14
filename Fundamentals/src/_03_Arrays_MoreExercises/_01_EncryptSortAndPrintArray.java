package _03_Arrays_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = Integer.parseInt(scanner.nextLine());
        String[] array = new String[arrLength];

        for(int index = 0;index < arrLength;index++){
            array[index] = scanner.nextLine();
        }

        Integer[] sumOfCodes = new Integer[arrLength];

        for (int index = 0;index<arrLength;index++){
            String currentString = array[index];
            int sumOfLetters = 0 ;

            for (int position = 0;position < currentString.length();position++){
                boolean isVowel = false;
                char letter = currentString.charAt(position);
                int letterCode = (int)letter;

                if(letter == 'A' || letter == 'a'|| letter == 'E' || letter == 'e'|| letter == 'I' || letter == 'i'|| letter == 'O' || letter == 'o'||letter == 'U' || letter == 'u'){
                    isVowel = true;
                }

                if(isVowel){
                    sumOfLetters = sumOfLetters + (letterCode * currentString.length());

                }else{
                    sumOfLetters = sumOfLetters + (letterCode / currentString.length());

                }

            }

            sumOfCodes [index] = sumOfLetters;
        }

        Arrays.sort(sumOfCodes);

        for (int code : sumOfCodes){
            System.out.println(code);
        }

    }

}
