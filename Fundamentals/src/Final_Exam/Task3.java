package Final_Exam;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsAndDefinitionsTokens = scanner.nextLine().split(" \\| ");
        Map< String , List <String> > wordsAndDefinitionsMap = new LinkedHashMap<>();

        for (String parameters :wordsAndDefinitionsTokens) {
            String word = parameters.split(": ")[0];
            String definition = parameters.split(": ")[1];

            if(!wordsAndDefinitionsMap.containsKey(word)){
                wordsAndDefinitionsMap.put(word,new ArrayList<>());
                wordsAndDefinitionsMap.get(word).add(definition);
            }else{
                wordsAndDefinitionsMap.get(word).add(definition);
            }
        }

        String[] testWords = scanner.nextLine().split(" \\| ");
        String command = scanner.nextLine();

        if("Test".equals(command)){

            for(String testWord :testWords){

                if(wordsAndDefinitionsMap.containsKey(testWord)){

                    System.out.println(testWord + ":");
                    List <String> definitions = wordsAndDefinitionsMap.get(testWord);
                    for(String definition :definitions){
                        System.out.println(" -" + definition);
                    }

                }

            }

        }else if ("Hand Over".equals(command)){
            for(Map.Entry<String, List<String>> entry : wordsAndDefinitionsMap.entrySet()){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
