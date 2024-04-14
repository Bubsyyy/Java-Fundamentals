package _01_BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbersArr = new Integer [3] ;
        numbersArr [0] = Integer.parseInt(scanner.nextLine());
        numbersArr [1] = Integer.parseInt(scanner.nextLine());
        numbersArr [2] = Integer.parseInt(scanner.nextLine());

        Arrays.sort(numbersArr, Collections.reverseOrder());



        System.out.println(numbersArr[0]);
        System.out.println(numbersArr[1]);
        System.out.println(numbersArr[2]);


    }

}