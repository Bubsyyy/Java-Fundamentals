package _02_DataTypesAndVariables_Exercises;

import java.util.Scanner;

public class _04_SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            char symbol = scanner.nextLine().charAt(0);
            sum += (int) symbol;
        }

        System.out.println("The sum equals: " + sum);
    }
}