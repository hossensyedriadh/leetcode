import java.util.Stack;

public class ValidParentheses {
    public static void main(String... args) {
        System.out.println(isValid("(){]{}[]["));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[' -> stack.push(c);
                case ')' -> {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                case '}' -> {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                case ']' -> {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                default -> {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
