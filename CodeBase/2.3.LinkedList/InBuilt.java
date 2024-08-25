import java.util.LinkedList;

public class InBuilt {

    public static void main(String[] args) {
        // Internally works as a doubly linked list
        LinkedList<Integer> linkedList = new LinkedList<>();


        // Add elements to the linked list
        linkedList.addFirst(0);  // Add element at the beginning
        linkedList.addLast(1);   // Add element at the end
        linkedList.add(2);       // Add element at the end (equivalent to addLast)

        // Additional add methods
        linkedList.add(1, 5); // Add element at a specific position (index 1)

        // Check if a particular element exists in the list
        System.out.println("Contains 0: " + linkedList.contains(0));

        // Retrieve elements from the linked list
        System.out.println("First Element: " + linkedList.getFirst());  // Get first element
        System.out.println("Element at index 1: " + linkedList.get(1)); // Get element at index 1
        System.out.println("Last Element: " + linkedList.getLast());    // Get last element

        // Remove elements from the linked list
        linkedList.removeFirst();  // Remove first element
        linkedList.removeLast();   // Remove last element
        linkedList.remove(0);      // Remove element at index 0 (previously index 1)

        // Check the size of the linked list
        System.out.println("Size of linked list: " + linkedList.size());

        // Peek methods (retrieves elements without removing them)
        linkedList.addFirst(10);
        System.out.println("Peek First Element: " + linkedList.peekFirst()); // Peek first element
        System.out.println("Peek Last Element: " + linkedList.peekLast());   // Peek last element

        // Poll methods (retrieves and removes elements)
        System.out.println("Poll First Element: " + linkedList.pollFirst()); // Poll (retrieve and remove) first element
        System.out.println("Poll Last Element: " + linkedList.pollLast());   // Poll (retrieve and remove) last element

        // Clear the entire linked list
        linkedList.clear();

        // Check if the linked list is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
    }
}
