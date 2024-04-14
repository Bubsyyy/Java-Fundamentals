package Final_Exam_Prep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());


        String regex = "(@[#]+)([A-Z][a-z,A-Z,0-9]{4,}[A-Z])(@[#]+)";
        Pattern pattern = Pattern.compile(regex);




        for(int i = 1 ; i<=numberOfBarcodes;i++){


            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if(matcher.find()){
                String validBarcode = matcher.group();
                System.out.println("Product group: " + getGroup(validBarcode));

            }else{
                System.out.println("Invalid barcode");
            }


    }


    }

    private static String getGroup(String barcode){

        String group = "";
        for (char symbol:barcode.toCharArray()) {

            if (Character.isDigit(symbol)){
                group += symbol;
            }

        }

        if(group.isEmpty()){
            group = "00";
        }

        return group;
    }


}

