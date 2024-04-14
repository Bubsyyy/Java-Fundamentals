package _01_BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.Scanner;

public class _02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numAsString = ("" + number);
        int stringLength = numAsString.length();
        char digit = numAsString.charAt(stringLength - 1);
        String digitPronounciation = "" ;

        switch (digit) {
            case '0':
                digitPronounciation = "zero";
                break;
            case '1':
                digitPronounciation = "one";
                break;
            case '2':
                digitPronounciation = "two";
                break;
            case '3':
                digitPronounciation = "three";
                break;
            case '4':
                digitPronounciation = "four";
                break;
            case '5':
                digitPronounciation = "five";
                break;
            case '6':
                digitPronounciation = "six";
                break;
            case '7':
                digitPronounciation = "seven";
                break;
            case '8':
                digitPronounciation = "eight";
                break;
            case '9':
                digitPronounciation = "nine";
                break;


        }
        System.out.println(digitPronounciation);
    }

}
