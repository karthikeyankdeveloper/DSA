import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue (min-heap by default)
        PriorityQueue<Task> pq = new PriorityQueue<>();

        // Add tasks with different priorities
        pq.add(new Task(2, "Clean the house"));
        pq.add(new Task(1, "Do homework"));
        pq.add(new Task(3, "Go for a walk"));

        // Peek the task with the highest priority (lowest number)
        System.out.println("Top priority task: " + pq.peek());

        // Remove and return tasks in priority order
        while (!pq.isEmpty()) {
            System.out.println("Processing task: " + pq.poll());
        }
    }
}

// Task class implementing Comparable to define priority comparison
class Task implements Comparable<Task> {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    @Override
    public int compareTo(Task other) {
        // Min-heap: lower priority value comes first
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return description + " (priority " + priority + ")";
    }
}
