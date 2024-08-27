package String;

import java.util.HashMap;
import java.util.Map;

public class duplEleString {
    public static void printDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charMap = new HashMap<>();

        // Convert the string to lowercase to consider case-insensitive duplicates
        str = str.toLowerCase();

        // Iterate through the string to count character occurrences
        for (char c : str.toCharArray()) {
            // Increment the count if the character is already present in the map
            // Otherwise, put the character in the map with count 1
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // Print the characters with count greater than 1
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        printDuplicateCharacters(str);
    }
}
