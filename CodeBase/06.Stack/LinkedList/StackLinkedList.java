package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {

    private Node head;

    public StackLinkedList() {
        head = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Pop operation
    public int pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int topData = head.data;
        head = head.next;
        return topData;
    }

    // Peek operation
    public int peek() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Size of the stack
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size of the Stack: "+stack.size()); 

    }
    
}
