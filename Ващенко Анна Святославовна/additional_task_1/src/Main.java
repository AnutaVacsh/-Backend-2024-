import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String input = "{[(}])";
        System.out.println(isBalanced(input));
    }

    public static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();

                if (!matches(opening, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    private static boolean matches(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}