package String;

// import java.util.HashMap;
// import java.util.Map;

// public class strToNumKeypad {
//     public static String convertToKeypadSequence(String sentence) {
//         // Define the keypad mapping
//         Map<Character, String> keypadMapping = new HashMap<>();
//         keypadMapping.put('a', "2");
//         keypadMapping.put('b', "22");
//         keypadMapping.put('c', "222");
//         keypadMapping.put('d', "3");
//         keypadMapping.put('e', "33");
//         keypadMapping.put('f', "333");
//         keypadMapping.put('g', "4");
//         keypadMapping.put('h', "44");
//         keypadMapping.put('i', "444");
//         keypadMapping.put('j', "5");
//         keypadMapping.put('k', "55");
//         keypadMapping.put('l', "555");
//         keypadMapping.put('m', "6");
//         keypadMapping.put('n', "66");
//         keypadMapping.put('o', "666");
//         keypadMapping.put('p', "7");
//         keypadMapping.put('q', "77");
//         keypadMapping.put('r', "777");
//         keypadMapping.put('s', "7777");
//         keypadMapping.put('t', "8");
//         keypadMapping.put('u', "88");
//         keypadMapping.put('v', "888");
//         keypadMapping.put('w', "9");
//         keypadMapping.put('x', "99");
//         keypadMapping.put('y', "999");
//         keypadMapping.put('z', "9999");
//         keypadMapping.put(' ', "0");

//         StringBuilder result = new StringBuilder();
//         for (char c : sentence.toLowerCase().toCharArray()) {
//             // Append the corresponding keypad sequence for each character
//             result.append(keypadMapping.getOrDefault(c, ""));
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String sentence = "Hello World";
//         System.out.println("Keypad sequence for '" + sentence + "': " + convertToKeypadSequence(sentence));
//     }
// }


import java.util.HashMap;
import java.util.Map;
public class strToNumKeypad{
    public static String convertTokeypad(String sentence){
        Map<Character, String> keypadMaping = new HashMap<>();
        keypadMaping.put('a', "2");
        keypadMaping.put('b', "22");
        keypadMaping.put('c', "222");
            
        StringBuilder result= new StringBuilder();
        for(char c: sentence.toLowerCase().toCharArray()){
        //append
        result.append(keypadMaping.getOrDefault(c, " "));
    }
    return result.toString();
}
public static void main(String [] args){
    String sentence = "c";
    System.out.println(convertTokeypad(sentence));
}
}