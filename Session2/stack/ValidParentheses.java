package Session2.stack;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                char top = stack.peek();
                if ((ch == ')' && top == '(')
                        || (ch == '}' && top == '{')
                        || (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input = "{[(]]}";
        System.out.println("is balanced: " + isBalanced(input));
    }
}























/*
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[(]]}";
        System.out.println("is balanced: "+isBalanced(input));
    }*/