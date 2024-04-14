package Final_Exam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("End")){

            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];

            switch (commandName){

                case "Translate":
                    String charToReplace = commandParts[1];
                    String replacement = commandParts[2];
                    input = input.replaceAll(charToReplace,replacement);
                    System.out.println(input);
                    break;
                case "Includes":
                    String substring = commandParts[1];
                    if(input.contains(substring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String startingSubstring = commandParts[1];
                    if(input.startsWith(startingSubstring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int lastIndex = input.lastIndexOf(commandParts[1]);
                    System.out.println(lastIndex);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int count = Integer.parseInt(commandParts[2]);
                    RemoveOperation(startIndex,count,input);
                    break;

            }



            command = scanner.nextLine();
        }
    }

    private static String RemoveOperation(int startIndex,int count,String input){

        if (startIndex >= 0 && startIndex < input.length()) {

            int endIndex = Math.min(startIndex + count, input.length());


            String result = input.substring(0, startIndex) + input.substring(endIndex);


            System.out.println(result);
        }

        return input;

    }
}
