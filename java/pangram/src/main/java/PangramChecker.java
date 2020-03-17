import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        char[] characters = input.toLowerCase().replaceAll("[^a-z]","").toCharArray();

        Set<Character> set = new HashSet<Character>();
        //add each element to a set
        for (int i = 0; i < characters.length; i++){
            set.add(characters[i]);
        }
        return set.size() ==26; 
    }

}
