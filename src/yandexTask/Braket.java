package yandexTask;

import java.util.*;

public class Braket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().trim();
        System.out.println(isValidSequence(sequence));
    }

    public static String isValidSequence(String seq) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return "no";
                }
                char top = stack.pop();
                if ((c == ')' && top == '(') ||
                        (c == ']' && top == '[') ||
                        (c == '}' && top == '{')) {
                    continue;
                } else {
                    return "no";
                }
            }
        }
        return stack.empty() ? "yes" : "no";
    }
}