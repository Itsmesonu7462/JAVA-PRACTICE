import java.util.Stack;

public class postFix {
    public static void main(String[] args) {
        String[] tokens = "2 3 * 5 4 * + 9 -".split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluate(operand1, operand2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println("The result is: " + stack.pop());
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*");
    }

    private static int evaluate(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                throw new RuntimeException("Invalid operator");
        }
    }
}