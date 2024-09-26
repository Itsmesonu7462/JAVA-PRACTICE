import java.util.Stack;

public class stackSorting {
   public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(5);
    stack.push(3);
    stack.push(6);
    stack.push(2);
    stack.push(1);
    stack.push(4);
    
    stack = sortStack(stack);
    int maxElement = stack.pop();
    System.out.println(maxElement + " is the highest element");
    while(!stack.isEmpty()){
        System.out.println(stack.pop());
    }
   }
   
   public static Stack<Integer> sortStack(Stack<Integer> stack) {
    Stack<Integer> tempStack = new Stack<Integer>();
    while (!stack.isEmpty()) {
        int temp = stack.pop();
        while (!tempStack.isEmpty() && tempStack.peek() > temp) {
            stack.push(tempStack.pop());
        }
        tempStack.push(temp);
    }
    return tempStack;
}
}