package array;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return element;
    }

    // Method to get the front element of the queue without removing it (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No elements to peek.");
            return -1;
        }
        return queue[front];
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }

    // Main method to demonstrate the queue
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // Should indicate that the queue is full

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());

        queue.enqueue(60); // Should successfully enqueue after dequeue
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.getSize());
    }
}