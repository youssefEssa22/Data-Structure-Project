public class ParenthesesChecker {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>(80);

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String input1 = "({()[()]})";
        String input2 = "(()))";
        String input3 = "(()]";

        System.out.println("Input: " + input1 + " => " + (isBalanced(input1) ? "Balanced" : "Not Balanced"));
        System.out.println("Input: " + input2 + " => " + (isBalanced(input2) ? "Balanced" : "Not Balanced"));
        System.out.println("Input: " + input3 + " => " + (isBalanced(input3) ? "Balanced" : "Not Balanced"));
    }
}
