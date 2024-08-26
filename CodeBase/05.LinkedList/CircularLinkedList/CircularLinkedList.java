package CircularLinkedList;

public class CircularLinkedList {
    // Inner Node class to represent each element in the list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the circular linked list
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // Add element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Link the tail to the head to form a circle
        } else {
            tail.next = newNode; // Link current tail to the new node
            tail = newNode; // Update the tail to be the new node
            tail.next = head; // Link the new tail to the head to maintain the circle
        }
        size++;
    }

    // Add element at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Link the tail to the head to form a circle
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail's next to the new head
        }
        size++;
    }

    // Remove an element from the list
    public boolean remove(int data) {
        if (head == null) {
            return false; // List is empty
        }

        Node current = head;
        Node previous = tail;
        do {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Update tail's next to the new head
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous; // Update the tail if the last element was removed
                        tail.next = head; // Ensure the circular structure is maintained
                    }
                }
                size--;
                return true; // Element found and removed
            }
            previous = current;
            current = current.next;
        } while (current != head);

        return false; // Element not found
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        
        // Adding elements to the circularLinkedList
        circularLinkedList.add(10);
        circularLinkedList.add(20);
        circularLinkedList.add(30);
        circularLinkedList.addFirst(5);

        // Display the circularLinkedList
        circularLinkedList.display(); // Output: 5 -> 10 -> 20 -> 30 -> (head)

        // Removing an element from the circularLinkedList
        circularLinkedList.remove(20);
        circularLinkedList.display(); // Output: 5 -> 10 -> 30 -> (head)

        // Check the size of the circularLinkedList
        System.out.println("Size: " + circularLinkedList.size()); // Output: Size: 3
    }
}

