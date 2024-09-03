import java.util.LinkedList;

public class LinkedListInBuilt {

    public static void main(String[] args) {
        // Internally works as a doubly linked list
        LinkedList<Integer> linkedList = new LinkedList<>();


        linkedList.addFirst(0);  
        linkedList.addLast(1);   
        linkedList.add(2);      

        linkedList.add(1, 5); 

        System.out.println("Contains 0: " + linkedList.contains(0));

        // Retrieve elements from the linked list
        System.out.println("First Element: " + linkedList.getFirst()); 
        System.out.println("Element at index 1: " + linkedList.get(1)); 
        System.out.println("Last Element: " + linkedList.getLast());   

        // Remove elements from the linked list
        linkedList.removeFirst();  
        linkedList.removeLast();   
        linkedList.remove(0);     

        // Check the size of the linked list
        System.out.println("Size of linked list: " + linkedList.size());

        // Peek methods (retrieves elements without removing them)
        linkedList.addFirst(10);
        System.out.println("Peek First Element: " + linkedList.peekFirst()); 
        System.out.println("Peek Last Element: " + linkedList.peekLast());  

        // Poll methods (retrieves and removes elements)
        System.out.println("Poll First Element: " + linkedList.pollFirst()); 
        System.out.println("Poll Last Element: " + linkedList.pollLast());   

        // Clear the entire linked list
        linkedList.clear();

        // Check if the linked list is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
    }
}
