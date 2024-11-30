import java.util.*;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList; // Required if using LinkedList for Queue implementation


public class queueRev {
  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<Integer>();
    q.add(5);
    q.add(6);
    q.add(3);
    q.add(7);

    System.out.println("Original Queue:");
    printQueue(q);

  
    Queue<Integer> reversedQueue = reverseQueue(q);

    System.out.println("Reversed Queue:");
    printQueue(reversedQueue);
  }

  public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
    Stack <Integer> stack = new Stack<>();

    while (!queue.isEmpty()) {
      stack.push(queue.poll());
    }

    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }

    return queue; 
  }

  public static void printQueue(Queue<Integer> queue) {
    Queue<Integer> tempQueue = new ArrayDeque<>(queue);
    while (!tempQueue.isEmpty()) {
      System.out.print(tempQueue.poll() + " ");
    }
    System.out.println();
  }
}
