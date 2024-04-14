package _01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0 ;
        int sum = 0 ;
        for (int i = 1 ; i <= Integer.MAX_VALUE ; i += 2){
            counter ++;
            if(counter>n){
                break;
            }
            System.out.println(i);
            sum += i;
        }
        System.out.printf("Sum: %d",sum);
    }
}
