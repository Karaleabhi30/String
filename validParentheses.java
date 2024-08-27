package String;

import java.util.Stack;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "([)]";
        String str3 = "{[()]}";
        

        System.out.println("Is '" + str1 + "' valid? " + isValid(str1));
        System.out.println("Is '" + str2 + "' valid? " + isValid(str2));
        System.out.println("Is '" + str3 + "' valid? " + isValid(str3));
    }
}


