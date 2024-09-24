import java.util.Arrays;

public class DutchNationalFlag { //Also Sort 0's , 1's and 2's
    public static void main(String[] args) {
        int arr[] = {2,0,0,2,0,1,1};
        // [0, 0, 0, 1, 1, 2, 2]
        // int arr[] = {2,0,0,2,0,1,1,1,1,2,0,0};
        // [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]
        int i = 0, j = arr.length-1, k = 0;
        while (i<=j) {
            if(arr[i]==2){
                swap(arr, i, j);
                j--;                
            }else if(arr[i]==0){
                swap(arr, i, k);
                i++;
                k++;
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
