import java.util.*;

public class StackExample {

    public static void inseratEnd(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int temp = s.pop();
        inseratEnd(s, data);
        s.push(temp); // Push the element back after the recursive call
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(11);

        System.out.println("Stack before inserting at end:");
        // Print and pop the stack contents
        Stack<Integer> tempStack = (Stack<Integer>)stack.clone();
        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.peek());
            tempStack.pop();
        }

        inseratEnd(stack, 7);

        System.out.println("Stack after inserting 4 at the end:");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
