//remove continue duplicate elements

package String;

import java.util.Scanner;

public class remConsecativeEle {
    static String removeConsecutive(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // If current character is not equal to next character (if it exists)
            if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume newline character

        while (T-- > 0) {
            String str = sc.nextLine();
            System.out.println(removeConsecutive(str));
        }
        sc.close();
    }
}

