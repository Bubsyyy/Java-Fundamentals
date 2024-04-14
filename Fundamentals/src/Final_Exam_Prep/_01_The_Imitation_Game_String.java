package Final_Exam_Prep;


import java.util.Scanner;

public class _01_The_Imitation_Game_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String command = scanner.nextLine();

        while(!command.equals("Decode")){

            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName){
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandParts[1]);
                    String textToMove = encryptedMessage.substring(0,numberOfLetters);
                    encryptedMessage = encryptedMessage.replace(textToMove,"");
                    encryptedMessage += textToMove;
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    StringBuilder sb = new StringBuilder(encryptedMessage);
                    sb.insert(index,value);
                    encryptedMessage = sb.toString();
                    break;
                case "ChangeAll":
                    String textToRemove = commandParts[1];
                    String replacement = commandParts[2];
                    encryptedMessage = encryptedMessage.replace(textToRemove,replacement);
                    break;

            }


            command = scanner.nextLine();
        }

        System.out.print("The decrypted message is: " + encryptedMessage);


    }
}
