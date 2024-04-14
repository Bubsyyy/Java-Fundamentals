package _08_TextProcessing;


import java.util.Scanner;

public class _04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            //"mask" -> "****"
            String replaceWord = "*".repeat(forbiddenWord.length());
            text = text.replace(forbiddenWord, replaceWord);
        }

        System.out.println(text);

    }
}