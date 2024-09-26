import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            return -1; // Return an invalid value or handle appropriately.
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class LinkedListSorter {
    public static Node sortLinkedList(Node head) {
        Stack stack = new Stack();
        Node current = head;

        // Push all node data into the stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Pop data from the stack into a list for sorting
        List<Integer> temp = new ArrayList<>();
        while (!stack.isEmpty()) {
            temp.add(stack.pop());
        }
        Collections.sort(temp);

        // Rebuild the sorted linked list
        Node newHead = null;
        Node tail = null;
        for (int data : temp) {
            Node newNode = new Node(data);
            if (newHead == null) {
                newHead = newNode;
                tail = newHead;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return newHead;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printList(head);

        // Sorting the linked list
        head = sortLinkedList(head);

        System.out.println("Sorted Linked List:");
        printList(head);
    }
}
