import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) throws IOException {

        List<String> list = Files.readAllLines(Paths.get("src/alice30.txt"));
        System.out.println("Ilość Linii: " + list.size());

        Set<String> set = new TreeSet<>();

        for(String line:list){
            //System.out.println(line);

            line = line.replaceAll("\\p{Punct}|\\d","");


            String[] words = line.split(" ");

            for(String word: words) {
                //System.out.print(word + "|");

                if(!word.isEmpty()){
                    set.add(word.toLowerCase());
                }

            }

            System.out.println();
        }

//        for (String word: set){
//            System.out.println(word);
//        }

        System.out.println();
        System.out.println("Znaleziono różnych wyrazów: " +set.size() );


        Map<Character, Integer> stat = new TreeMap<>();
for(String word: set){
    char currentfirstChar = word.charAt(0);

    if (stat.containsKey(currentfirstChar)){
        stat.put(currentfirstChar, stat.get(currentfirstChar+1));
    }else {
        stat.put(currentfirstChar, 1);
    }
}

        System.out.println(stat);


    }

}
