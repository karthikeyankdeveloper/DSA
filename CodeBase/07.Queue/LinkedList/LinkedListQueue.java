package LinkedList;

public class LinkedListQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    // Method to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + data);
    }

    // Method to remove a node from the front of the list
    public void remove() {
        if (head == null) {
            System.out.println("List is empty. Cannot remove element.");
            return;
        }
        System.out.println("Removed: " + head.data);
        head = head.next;
    }

    // Method to display all elements in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to demonstrate the linked list
    public static void main(String[] args) {
        LinkedListQueue list = new LinkedListQueue();

        list.add(10);
        list.add(20);
        list.add(30);
        list.display();

        list.remove();
        list.display();

        list.add(40);
        list.add(50);
        list.display();
    }
}
