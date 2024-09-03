import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 
 * Queue Example:
    We use LinkedList to create a queue. The elements are enqueued in the order 22, 20, 30, 40.
    The peek() method retrieves the front element (22) without removing it.
    The remove() method dequeues the first two elements (22, 20).

 * Priority Queue Example:
    We use PriorityQueue which by default orders elements in a natural ascending order (min-heap).
    The peek() method retrieves the smallest element (10) without removing it.
    The poll() method dequeues the elements with the highest priority (smallest value).
*/

public class QueueInBuilt {

    public static void PriorityQueue(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        System.out.println("Element with highest priority: " + priorityQueue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + priorityQueue.poll());
        System.out.println("Dequeued: " + priorityQueue.poll());

        System.out.println("Element with highest priority after dequeuing: " + priorityQueue.peek());

        System.out.println("Remaining elements in the priority queue: " + priorityQueue);
    }


    public static void LinkedList(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(22);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Front of the queue: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.remove());
        System.out.println("Dequeued: " + queue.remove());

        System.out.println("Front of the queue after dequeuing: " + queue.peek());

        System.out.println("Remaining elements in the queue: " + queue);
    }



    public static void ArrayDeque(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        deque.addFirst(5);
        deque.addLast(50);

        System.out.println("Front of the deque: " + deque.peekFirst());
        System.out.println("Back of the deque: " + deque.peekLast());

        System.out.println("Removed from front: " + deque.removeFirst());

        System.out.println("Removed from back: " + deque.removeLast());

        System.out.println("Remaining elements in the deque: " + deque);
    }


    public static void main(String[] args) {

        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();
        animal1.peek();

        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();
        animal2.peek();

        // Priority Queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();
        animal3.peek();



        PriorityQueue();

        LinkedList();

        ArrayDeque();
        

    }

}
