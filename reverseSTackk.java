import java.util.Stack;

public class  reverseSTackk {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }

    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty())
            stack.push(x);
        else {
            int temp = stack.pop();
            insertAtBottom(stack, x);
            stack.push(temp);
        }
    }
}