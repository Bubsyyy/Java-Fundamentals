package Final_Exam_Prep;


import java.util.Scanner;

public class _01_The_Imitation_Game_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(encryptedMessage);

        String command = scanner.nextLine();

        while(!command.equals("Decode")){

            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName){
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandParts[1]);
                    String textToMove = message.substring(0,numberOfLetters);
                    message.delete(0,numberOfLetters);
                    message.append(textToMove);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    message.insert(index,value);
                    break;
                case "ChangeAll":
                    String textToRemove = commandParts[1];
                    String replacement = commandParts[2];
                    String currentMessage = message.toString();
                    String newMessage = currentMessage.replaceAll(textToRemove,replacement);
                    message = new StringBuilder(newMessage);
                    break;

            }


            command = scanner.nextLine();
        }

        System.out.print("The decrypted message is: " + message);


    }
}
