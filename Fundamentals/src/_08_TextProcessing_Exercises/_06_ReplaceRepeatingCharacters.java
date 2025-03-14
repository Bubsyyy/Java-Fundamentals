package _08_TextProcessing_Exercises;

import java.util.Scanner;

public class _06_ReplaceRepeatingCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);

        for (int position = 0; position < textBuilder.length() - 1; position++) {
            if (textBuilder.charAt(position) == textBuilder.charAt(position + 1)) {
                textBuilder.deleteCharAt(position + 1);
                position--;
            }
        }

        System.out.println(textBuilder);
    }
}
