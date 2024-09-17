public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {10,22,28,30,33,45,66,72,84,89};
        System.out.println("Find at index : "+search(data,85));
    }

    private static int search(int[] data,int n){
        int start = 0;
        int end = data.length-1;
        while (start<=end) {
            int midIndex = (start+end)/2;
            int midValue = data[midIndex];

            if(midValue==n)
                return midIndex;

            if(n<midValue){
                end = midIndex-1;
            }else{
                start = midIndex+1;
            }
            
        }
        return -1;
    }
}
