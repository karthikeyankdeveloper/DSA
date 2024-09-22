package MaxHeap;
import java.util.Arrays;

public class MaxPQ {

    private int[] heap;
    private int index;

    public MaxPQ(int capacity) {
        heap = new int[capacity + 1];
        index = 0;
    }

    private void insert(int data) {
        index++;
        if (heap.length == index) {
            heap = dynamicArray(heap);
        }
        heap[index] = data;
        swim(index);
    }

    private void swim(int n) {
        while (n > 1 && heap[n / 2] < heap[n]) {
            int temp = heap[n];
            heap[n] = heap[n / 2];
            heap[n / 2] = temp;
            n = n / 2;
        }
    }

    private int[] dynamicArray(int[] arr) {
        int[] model = new int[arr.length * 2];
        for (int i = 1; i < arr.length; i++) {
            model[i] = arr[i];
        }
        return model;
    }

    private int deleteMax() {
        if (index == 0) {
            System.out.println("No Element FOund!");
            return -1;
        }

        int max = heap[1];

        heap[1] = heap[index];
        heap[index] = 0;
        index--;

        sink(1);

        return max;
    }

    private void sink(int k) {

        while (k < index) {
            boolean child1 = k*2<=index;
            boolean child2 = k*2+1<=index;

            if(child1 && child2){
                int maxIndex = heap[k*2]>heap[k*2+1]?k*2:k*2+1;

                if(heap[k]<heap[maxIndex]){
                    int temp = heap[k];
                    heap[k] = heap[maxIndex];
                    heap[maxIndex] = temp;
                    k = maxIndex;
                    continue;
                }else{
                    break;
                }
            }else if(child1==true && child2==false){
                if(heap[k]<heap[k*2]){
                    int temp = heap[k];
                    heap[k] = heap[k*2];
                    heap[k*2] = temp;
                    k = k*2;
                    continue;
                }else{
                    break;
                }
            }else{
                break;
            }

        }

    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        System.out.println(maxPQ.isEmpty());
        System.out.println(maxPQ.size());

        maxPQ.insert(10);
        maxPQ.insert(9);
        maxPQ.insert(12);
        maxPQ.insert(15);

        System.out.println(Arrays.toString(maxPQ.heap));
        System.out.println(maxPQ.size());

        System.out.println("Deleted " + maxPQ.deleteMax());
        System.out.println(Arrays.toString(maxPQ.heap));
        System.out.println(maxPQ.size());
    }

    private boolean isEmpty() {
        return index == 0;
    }

    private int size() {
        return index;
    }

}
