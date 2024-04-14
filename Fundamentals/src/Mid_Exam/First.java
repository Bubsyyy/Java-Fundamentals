package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("End")){
            String operation = command.split(" - ")[0];
            String phone = command.split(" - ")[1];

            if(operation.equals("Add")){

                if(!phones.contains(phone)){
                    phones.add(phone);
                }

            } else if (operation.equals("Remove")) {

                phones.remove(phone);

            } else if (operation.equals("Bonus phone")) {
                String oldPhone = phone.split(":")[0];
                String bonusPhone = phone.split(":")[1];
                if(phones.contains(oldPhone)){
                    int oldPhoneIndex = phones.indexOf(oldPhone);
                    phones.add(oldPhoneIndex + 1, bonusPhone);
                }

            } else if (operation.equals("Last")) {
                if(phones.contains(phone)){
                    phones.remove(phone);
                    phones.add(phone);

                }

            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", phones));

    }
}
