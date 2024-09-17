public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {10,20,34,2,58,90};
        int n = 58;

        System.out.println("Find at index : "+search(data,n));
    }

    private static int search(int[] data,int n){
        // Either forward or backward direction until find n
        for(int i=0;i<data.length;i++){
            if(data[i]==n) return i;
        }
        return -1;
    }
}
