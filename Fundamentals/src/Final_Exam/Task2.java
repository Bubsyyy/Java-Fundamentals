package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        String regex = "(\\|(?<boss>[A-Z]{4,})\\|):(#(?<position>[A-Z][a-z]+ [A-za-z]+)#)";
        Pattern pattern = Pattern.compile(regex);

        for(int i = 1 ; i <= numberOfInputs ; i++){
            String bossTokens = scanner.nextLine();
            Matcher matcher = pattern.matcher(bossTokens);

            if(matcher.find()){
                String bossName = matcher.group("boss");
                String position = matcher.group("position");
                System.out.printf("%s, The %s\n",bossName,position);
                System.out.println(">> Strength: " + bossName.length());
                System.out.println(">> Armor: " + position.length());
            }else{
                System.out.println("Access denied!");
            }

        }
    }
}
