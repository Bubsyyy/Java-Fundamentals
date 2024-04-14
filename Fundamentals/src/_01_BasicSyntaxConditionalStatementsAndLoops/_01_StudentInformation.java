package _01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); //име на студента
        int age = Integer.parseInt(scanner.nextLine()); //възраст на судента
        double averageGrade = Double.parseDouble(scanner.nextLine()); //средна оценка на студента

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);
    }
}
