package _03_Arrays;


import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] texts = scanner.nextLine().split(" ");
        //"a b c d e".split(" ") -> ["a", "b", "c", "d", "e"]

        for (int position = texts.length - 1; position >= 0; position--) {
            System.out.print(texts[position] + " ");
        }

    }
}