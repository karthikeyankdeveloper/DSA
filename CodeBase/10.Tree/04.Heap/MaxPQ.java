import java.util.Arrays;

public class MaxPQ {

    private int[] heap;
    private int index;

    public MaxPQ(int capacity){
        heap =  new int[capacity+1];
        index=0;
    } 

    private void insert(int data){
        index++;
        if(index==1){
            heap[index] = data;
            return;
        }

        if(heap.length == index){
            heap = dynamicArray(heap);
        }

        heap[index] = data;
        swim(index);
    }

    private void swim(int n){

        while (n>1 && heap[n/2]<heap[n]) {
            int temp = heap[n];
            heap[n] = heap[n/2];
            heap[n/2] = temp;
            n = n/2;            
        }

    }

    private int[] dynamicArray(int[] arr){
        int[] model = new int[arr.length*2];
        for(int i=1;i<arr.length;i++){
            model[i] = arr[i];
        }
        return model;
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        System.out.println(maxPQ.isEmpty());
        System.out.println(maxPQ.size());

        maxPQ.insert(10);
        maxPQ.insert(9);
        maxPQ.insert(12);

        System.out.println(Arrays.toString(maxPQ.heap));
    }

    private boolean isEmpty(){
        return index==0;
    }

    private int size(){
        return index;
    }
    
}
