package array;

public class ArrayStack {

    private int[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public ArrayStack(int size) {
        stack = new int[size]; 
        maxSize = size;       
        top = -1;           
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int data) {
        if (top == maxSize - 1) { 
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = data;
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (top == -1) { // Check for stack underflow
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--]; // Return the top element and decrement top
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (top == -1) { // Check if the stack is empty
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top]; // Return the top element
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1; 
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.display();

        System.out.println("Popped element: " + stack.pop());

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Size of the stack: " + stack.size());
    }
    
}
