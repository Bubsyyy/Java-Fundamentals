package _02_DataTypesAndVariables;


import java.util.Scanner;

public class _06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        //начин 1
        //System.out.println("" + firstSymbol + secondSymbol + thirdSymbol);

        //начин 2
        System.out.printf("%c%c%c", firstSymbol, secondSymbol, thirdSymbol);

    }
}